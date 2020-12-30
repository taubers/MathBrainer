package development;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import javax.script.Bindings;
import java.math.RoundingMode;


public class MathBrainerController {


    private enum State {SOLVING, SOLVED}

    State solutionStatus;
    String expression;
    AbstractExercise exercise;

    private void render() {
        switch (solutionStatus) {
            case SOLVING -> {
                this.exercise = ExerciseFactory.getExercise();
                expression = exercise.getFirstNumber() + " " + exercise.getOperator() + " " + exercise.getSecondNumber() + " = ";
                displayExerciseField.setText(expression);
                nextExerciseButton.setVisible(false);
                checkAnswerButton.setVisible(true);
                enterAnswerField.clear();
                enterAnswerField.setManaged(true);
                displayOutputMessageField.setText("");

            }

            case SOLVED -> {
                nextExerciseButton.setVisible(true);
                checkAnswerButton.setVisible(false);
                enterAnswerField.setManaged(false);
                displayOutputMessageField.setText("Malacis! Pareizi! :) \n");
                displayOutputMessageField.setTextFill(Color.web("green"));

            }

        }
    }

    @FXML
    private Slider levelSlider;

    @FXML
    private Label showQuestionLabel;

    @FXML
    private Label levelName;

    @FXML
    private Label showCorrectAnswerLabel;

    @FXML
    private Label showWrongAnswerLabel;

    @FXML
    private TextField displayExerciseField;

    @FXML
    private TextField enterAnswerField;


    @FXML
    private Button checkAnswerButton;

    @FXML
    private Button nextExerciseButton;


    @FXML
    private Label displayOutputMessageField;


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

        if (answer == exercise.getResult()) {
            solutionStatus = State.SOLVED;
            render();
        } else {
            displayOutputMessageField.setText("Nav pareizi :( Mēģini vēlreiz... \n");
            displayOutputMessageField.setTextFill(Color.web("red"));
        }


    }


    @FXML
    private void nextExercise(ActionEvent nextExercise) {
        solutionStatus = State.SOLVING;
        render();
    }


    @FXML
    private void submitWithEnterKey(ActionEvent event) {
        enterAnswerField.setOnKeyPressed(enterKeyPressed -> {
            if (State.SOLVING.equals(solutionStatus) && enterKeyPressed.getCode() == KeyCode.ENTER) {
                checkAnswerButton.fire();
            } else if (State.SOLVED.equals(solutionStatus) && enterKeyPressed.getCode() == KeyCode.ENTER) {
                nextExerciseButton.fire();
            }

        });
    }


    public void initialize() {
        solutionStatus = State.SOLVING;
        render();

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
                        levelName.setText("Bakalaurs");
                    }
                    if (levelSlider.getValue() == 6) {
                        levelName.setText("Maģistrs");
                    }
                    if (levelSlider.getValue() == 7) {
                        levelName.setText("Einšteins");
                    }


                }
        );
    }


}



