package development;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;


public class MathBrainerController {

private String SUCCESS;
private String FAILURE;
private String NUMBERS_ONLY;
private String DIFFICULTY_LEVEL_1;
private String DIFFICULTY_LEVEL_2;
private String DIFFICULTY_LEVEL_3;
private String DIFFICULTY_LEVEL_4;
private String DIFFICULTY_LEVEL_5;
private String DIFFICULTY_LEVEL_6;
private String DIFFICULTY_LEVEL_7;


    MathBrainerModel model = new MathBrainerModel();


    @FXML
    private Slider levelSlider;

    @FXML
    private Label showCountdownLabel;

    @FXML
    private Label levelName;

    @FXML
    private Label showCorrectAnswerLabel;

    @FXML
    private Label showWrongAnswerLabel;

    @FXML
    private Label displayExerciseField;

    @FXML
    private TextField enterAnswerField;


    @FXML
    private Button checkAnswerButton;

    @FXML
    private Button nextExerciseButton;


    @FXML
    private Label displayOutputMessageField;

    private void updateView() {

        switch (model.getSolutionState()) {
            case SOLVING -> {
                String expression = model.getExercise().getFirstNumber() + " " + model.getExercise().getOperator() + " " + model.getExercise().getSecondNumber() + " = ";
                displayExerciseField.setText(expression);
                nextExerciseButton.setVisible(false);
                checkAnswerButton.setVisible(true);
                enterAnswerField.clear();
                enterAnswerField.setEditable(true);
                displayOutputMessageField.setText(null);
            }

            case SOLVED -> {
                nextExerciseButton.setVisible(true);
                checkAnswerButton.setVisible(false);
                enterAnswerField.setEditable(false);
                displayOutputMessageField.setText("Malacis! Pareizi! :) \n");
                displayOutputMessageField.setTextFill(Color.web("green"));

            }

        }
    }

    private void detectLanguage(){
        switch (model.getUserLanguage()){
            case LATVIAN -> {
                SUCCESS = "Malacis! Pareizi! :)" ;
                FAILURE = "Nav pareizi :( Mēģini vēlreiz...";
                NUMBERS_ONLY = "Lūdzu ievadi tikai skaitļus";
                DIFFICULTY_LEVEL_1 = "Bēbis";
                DIFFICULTY_LEVEL_2 = "Pirmklasnieks";
                DIFFICULTY_LEVEL_3 = "Vidusskolnieks";
                DIFFICULTY_LEVEL_4 = "Students";
                DIFFICULTY_LEVEL_5 = "Profesionālis";
                DIFFICULTY_LEVEL_6 = "Skolotājs";
                DIFFICULTY_LEVEL_7 = "Einšteins";
            }
            /*case GERMAN -> {
                SUCCESS;
                FAILURE;
                NUMBERS_ONLY;
                DIFFICULTY_LEVEL_1;
                DIFFICULTY_LEVEL_2;
                DIFFICULTY_LEVEL_3;
                DIFFICULTY_LEVEL_4;
                DIFFICULTY_LEVEL_5;
                DIFFICULTY_LEVEL_6;
                DIFFICULTY_LEVEL_7;
            }
            case RUSSIAN -> {
                SUCCESS;
                FAILURE;
                NUMBERS_ONLY;
                DIFFICULTY_LEVEL_1;
                DIFFICULTY_LEVEL_2;
                DIFFICULTY_LEVEL_3;
                DIFFICULTY_LEVEL_4;
                DIFFICULTY_LEVEL_5;
                DIFFICULTY_LEVEL_6;
                DIFFICULTY_LEVEL_7;
            }
            default -> { //English
                SUCCESS;
                FAILURE;
                NUMBERS_ONLY;
                DIFFICULTY_LEVEL_1;
                DIFFICULTY_LEVEL_2;
                DIFFICULTY_LEVEL_3;
                DIFFICULTY_LEVEL_4;
                DIFFICULTY_LEVEL_5;
                DIFFICULTY_LEVEL_6;
                DIFFICULTY_LEVEL_7;
            }

*/
        }
    }

    @FXML
    private void checkAnswer(ActionEvent checkAnswer) {
        int answer;
        try {
            answer = Integer.parseInt(enterAnswerField.getText());
        } catch (NumberFormatException e) {
            displayOutputMessageField.setText("Lūdzu ievadi tikai skaitļus\n");
            displayOutputMessageField.setTextFill(Color.web("black"));
            return;
        }

        if (answer == model.getExercise().getResult()) {
            model.incrementCorrectAnswerCounter();
            showCorrectAnswerLabel.setText(String.valueOf(model.getCorrectAnswerCounter()));
            model.toSolved();
            updateView();
        } else {
            model.incrementWrongAnswerCounter();
            showWrongAnswerLabel.setText(String.valueOf(model.getWrongAnswerCounter()));
            displayOutputMessageField.setText("Nav pareizi :( Mēģini vēlreiz... \n");
            displayOutputMessageField.setTextFill(Color.web("red"));
        }


    }


    @FXML
    private void nextExercise(ActionEvent nextExercise) {
        model.toSolving();
        updateView();
    }


    @FXML
    private void submitWithEnterKey(ActionEvent event) {
        enterAnswerField.setOnKeyPressed(enterKeyPressed -> {
            if (model.getSolutionState() == MathBrainerModel.State.SOLVING && enterKeyPressed.getCode() == KeyCode.ENTER) {
                checkAnswerButton.fire();
            } else if (model.getSolutionState() == MathBrainerModel.State.SOLVED && enterKeyPressed.getCode() == KeyCode.ENTER) {
                nextExerciseButton.fire();
            }

        });
    }

    public void timerCallback(Integer ticksLeft) {
        showCountdownLabel.setText(String.valueOf(ticksLeft));
    }

    public void initialize() {
        model.setTimerCallback(this::timerCallback);
        model.setUserLanguage(MathBrainerModel.Language.LATVIAN);
        detectLanguage();


        levelSlider.valueProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (levelSlider.getValue() == 1) {
                        levelName.setText("Bēbis");
                    }
                    if (levelSlider.getValue() == 2) {
                        levelName.setText("Pirmklasnieks");
                    }
                    if (levelSlider.getValue() == 3) {
                        levelName.setText("Vidusskolnieks");
                    }
                    if (levelSlider.getValue() == 4) {
                        levelName.setText("Students");
                    }
                    if (levelSlider.getValue() == 5) {
                        levelName.setText("Profesionālis");
                    }
                    if (levelSlider.getValue() == 6) {
                        levelName.setText("Skolotājs");
                    }
                    if (levelSlider.getValue() == 7) {
                        levelName.setText("Einšteins");
                    }


                }
        );

        model.toSolving();
        updateView();
    }


}



