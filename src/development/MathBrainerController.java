package development;

import Calculators.ExerciseFactory;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.Timer;
import java.util.TimerTask;


public class MathBrainerController {


    private enum State {SOLVING, SOLVED}

    private State solutionStatus;
    private AbstractExercise exercise;
    private int correctAnswerCounter;
    private int wrongAnswerCounter;
    private static int ticksLeft; // doesn't let me set "final" due to COUNTER--;

    @FXML
    private Slider levelSlider;

    @FXML
    private Label showQuestionLabel;

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

    private void render() {
        String expression;
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

    private void setTimer() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (solutionStatus == State.SOLVING) {
                    //Platform.setImplicitExit(false);
                    Platform.runLater(() -> showCountdownLabel.setText(String.valueOf(ticksLeft)));
                        ticksLeft--;
                        if(ticksLeft ==0){
                            timer.cancel();
                        }
                }
                if (solutionStatus == State.SOLVED){
                    timer.cancel();
                }
            }

        }, 1000, 1000);
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

        if (answer == exercise.getResult()) {
            correctAnswerCounter++;
            showCorrectAnswerLabel.setText(String.valueOf(correctAnswerCounter));
            solutionStatus = State.SOLVED;
            render();
        } else {
            wrongAnswerCounter++;
            showWrongAnswerLabel.setText(String.valueOf(wrongAnswerCounter));
            displayOutputMessageField.setText("Nav pareizi :( Mēģini vēlreiz... \n");
            displayOutputMessageField.setTextFill(Color.web("red"));
        }


    }


    @FXML
    private void nextExercise(ActionEvent nextExercise) {
       initialize();
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
        ticksLeft = 10;
        solutionStatus = State.SOLVING;
        render();
        setTimer();




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



