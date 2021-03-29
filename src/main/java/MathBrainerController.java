import exercises.Level;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.Locale;
import java.util.ResourceBundle;


public class MathBrainerController {

    MathBrainerModel model = new MathBrainerModel();

    Level level;

    @FXML
    ResourceBundle bundle = ResourceBundle.getBundle("language", Locale.forLanguageTag("lv"));

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
    private Button giveUpButton;


    @FXML
    private Label displayOutputMessageField;

    private void updateView() {

        switch (model.getSolutionState()) {

            case SOLVING -> {

                String expression = model.getExercise().getFirstNumber() + " " + model.getExercise().getOperator() + " " + model.getExercise().getSecondNumber() + " = ";
                displayExerciseField.setText(expression);
                nextExerciseButton.setVisible(false);
                checkAnswerButton.setVisible(true);
                giveUpButton.setVisible(true);
                enterAnswerField.clear();
                enterAnswerField.setEditable(true);
                displayOutputMessageField.setText(null);
            }

            case SOLVED -> {

                nextExerciseButton.setVisible(true);
                checkAnswerButton.setVisible(false);
                enterAnswerField.setEditable(false);
                giveUpButton.setVisible(false);
                displayOutputMessageField.setText(bundle.getString("success_message"));
                displayOutputMessageField.setTextFill(Color.web("green"));
            }

            case GAVE_UP -> {

                nextExerciseButton.setVisible(true);
                checkAnswerButton.setVisible(false);
                enterAnswerField.setEditable(false);
                giveUpButton.setVisible(false);
                displayOutputMessageField.setText(bundle.getString("give_up_message"));
                displayOutputMessageField.setTextFill(Color.web("orange"));
            }
        }

    }

    @FXML
    private void checkAnswer(ActionEvent checkAnswer) {
        int answer;
        try {
            answer = Integer.parseInt(enterAnswerField.getText());
        } catch (NumberFormatException e) {
            displayOutputMessageField.setText(bundle.getString("numbers_only_message"));
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
            displayOutputMessageField.setText(bundle.getString("failure_message"));
            displayOutputMessageField.setTextFill(Color.web("red"));
        }


    }


    @FXML
    private void nextExercise(ActionEvent nextExercise) {
        model.toSolving();
        updateView();
    }

    @FXML
    void giveUp(ActionEvent event) {
        model.incrementWrongAnswerCounter();
        showWrongAnswerLabel.setText(String.valueOf(model.getWrongAnswerCounter()));
        model.toGaveUp();
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


    public Level getSliderLevel(){
        int slidervalue = (int) levelSlider.getValue();
        switch (slidervalue){
            case 1:
                level =  Level.LEVEL_1;
                break;
            case 2:
                level = Level.LEVEL_2;
                break;
            case 3:
                level = Level.LEVEL_3;
                break;
            case 4:
                level = Level.LEVEL_4;
                break;
            case 5:
                level = Level.LEVEL_5;
                break;
            case 6:
                level = Level.LEVEL_6;
                break;
            case 7:
                level = Level.LEVEL_7;
                break;
        }
        return level;
    }


    public void timerCallback(Integer ticksLeft) {
        showCountdownLabel.setText(String.valueOf(ticksLeft));
    }

    public void initialize() {
        model.setTimerCallback(this::timerCallback);

        levelSlider.valueProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (levelSlider.getValue() == 1) {
                        levelName.setText(bundle.getString("difficulty_level_1_name"));

                    }
                    if (levelSlider.getValue() == 2) {
                        levelName.setText(bundle.getString("difficulty_level_2_name"));
                    }
                    if (levelSlider.getValue() == 3) {
                        levelName.setText(bundle.getString("difficulty_level_3_name"));
                    }
                    if (levelSlider.getValue() == 4) {
                        levelName.setText(bundle.getString("difficulty_level_4_name"));
                    }
                    if (levelSlider.getValue() == 5) {
                        levelName.setText(bundle.getString("difficulty_level_5_name"));
                    }
                    if (levelSlider.getValue() == 6) {
                        levelName.setText(bundle.getString("difficulty_level_6_name"));
                    }
                    if (levelSlider.getValue() == 7) {
                        levelName.setText(bundle.getString("difficulty_level_7_name"));
                    }


                }
        );


        model.toSolving();
        updateView();
    }


}



