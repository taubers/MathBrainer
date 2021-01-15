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

        switch (model.solutionStatus) {
            case SOLVING -> {
                String expression = model.exercise.getFirstNumber() + " " + model.exercise.getOperator() + " " + model.exercise.getSecondNumber() + " = ";
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

        if (answer == model.exercise.getResult()) {
            model.correctAnswerCounter++;
            showCorrectAnswerLabel.setText(String.valueOf(model.correctAnswerCounter));
            model.toSolved();
            updateView();
        } else {
            model.wrongAnswerCounter++;
            showWrongAnswerLabel.setText(String.valueOf(model.wrongAnswerCounter));
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
            if (model.solutionStatus == MathBrainerModel.State.SOLVING && enterKeyPressed.getCode() == KeyCode.ENTER) {
                checkAnswerButton.fire();
            } else if (model.solutionStatus == MathBrainerModel.State.SOLVED && enterKeyPressed.getCode() == KeyCode.ENTER) {
                nextExerciseButton.fire();
            }

        });
    }

    public void timerCallback(Integer ticksLeft) {
        showCountdownLabel.setText(String.valueOf(ticksLeft));
    }

    public void initialize() {
        model.setTimerCallback(this::timerCallback);
        nextExercise(null);


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
    }


}



