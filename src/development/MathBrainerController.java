package development;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;


public class MathBrainerController {


    private enum State {SOLVING, SOLVED}

    State solutionStatus;
    int answer;

    private void statusAction() {
        switch (solutionStatus) {
            case SOLVING -> {
                while (true) {
                    AbstractExercise exercise = ExerciseFactory.getExercise();
                    String expression = exercise.getFirstNumber() + " " + exercise.getOperator() + " " + exercise.getSecondNumber() + " = " + "X";
                    try {
                        do {
                            displayExerciseField.setText(expression);
                            answer = Integer.parseInt(enterAnswerField.getText());
                            if (answer != exercise.getResult()) {
                                displayOutputMessageField.setText("Nav pareizi :( Mēģini vēlreiz... \n");
                                displayOutputMessageField.setTextFill(Color.web("red"));
                            }
                        } while (answer != exercise.getResult());
                    } catch (NumberFormatException e) {
                        displayOutputMessageField.setText("Lūdzu ievadi tikai skaitļus\n");
                        displayOutputMessageField.setTextFill(Color.web("black"));
                    }
                }
            }

            case SOLVED -> {
                nextExerciseButton.setVisible(true);
                enterAnswerField.setManaged(false);
                displayOutputMessageField.setText("Malacis! Pareizi! :) \n");
                displayOutputMessageField.setTextFill(Color.web("green"));

            }

        }
    }


    @FXML
    private Label showQuestionLabel;

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
    //event needed

    }

    @FXML
    private void nextExercise(ActionEvent nextExercise){
    //event needed
    }


    @FXML
    private void submitWithEnterKey(ActionEvent event) {
        enterAnswerField.setOnKeyPressed(enterKeyPressed -> {
            if (enterKeyPressed.getCode() == KeyCode.ENTER) {
                checkAnswerButton.fire();
            }
        });
    }


    public void initialize() {

        nextExerciseButton.setVisible(false);


    }


}



