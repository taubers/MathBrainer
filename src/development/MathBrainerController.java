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
                displayOutputMessageField.setText(model.language.getSuccess());
                displayOutputMessageField.setTextFill(Color.web("green"));

            }

        }
    }

    @FXML
    private void checkAnswer(ActionEvent checkAnswer) {
        int answer;
        try {
            answer = Integer.parseInt(enterAnswerField.getText());
        } catch (NumberFormatException e) {
            displayOutputMessageField.setText(model.language.getNumbersOnly());
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
            displayOutputMessageField.setText(model.language.getFailure());
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
        model.getUserLanguage();
        model.setTimerCallback(this::timerCallback);
        levelName.setText(model.language.getDifficultyLevel_1());


        levelSlider.valueProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (levelSlider.getValue() == 1) {
                        levelName.setText(model.language.getDifficultyLevel_1());
                    }
                    if (levelSlider.getValue() == 2) {
                        levelName.setText(model.language.getDifficultyLevel_2());
                    }
                    if (levelSlider.getValue() == 3) {
                        levelName.setText(model.language.getDifficultyLevel_3());
                    }
                    if (levelSlider.getValue() == 4) {
                        levelName.setText(model.language.getDifficultyLevel_4());
                    }
                    if (levelSlider.getValue() == 5) {
                        levelName.setText(model.language.getDifficultyLevel_5());
                    }
                    if (levelSlider.getValue() == 6) {
                        levelName.setText(model.language.getDifficultyLevel_6());
                    }
                    if (levelSlider.getValue() == 7) {
                        levelName.setText(model.language.getDifficultyLevel_7());
                    }


                }
        );

        model.toSolving();
        updateView();
    }


}



