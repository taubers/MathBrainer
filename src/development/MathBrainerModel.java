package development;

import exercises.AbstractExercise;
import exercises.ExerciseFactory;
import javafx.application.Platform;

import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;

public class MathBrainerModel {
    protected enum State {SOLVING, SOLVED}
    protected enum Language{LATVIAN, RUSSIAN, ENGLISH, GERMAN}

    private State solutionState;
    private Language userLanguage;
    private AbstractExercise exercise;
    private int correctAnswerCounter;
    private int wrongAnswerCounter;
    private static final int MAX = 10; // A maximal number used to determine the starting point of a countdown of timers
    private int ticksLeft;
    private Consumer<Integer> timerCallback;
    private Timer timer;


    public void toSolving() {
        solutionState = State.SOLVING;
        exercise = ExerciseFactory.getExercise();
        setTimer();

    }

    public void toSolved() {
        solutionState = State.SOLVED;
        timer.cancel();
    }

    public State getSolutionState() {
        return solutionState;
    }

    public Language getUserLanguage(){
        return userLanguage;
    }

    public AbstractExercise getExercise() {
        return exercise;
    }

    public int getCorrectAnswerCounter() {
        return correctAnswerCounter;
    }

    public int incrementCorrectAnswerCounter() {
        return correctAnswerCounter++;
    }

    public int getWrongAnswerCounter() {
        return wrongAnswerCounter;
    }

    public int incrementWrongAnswerCounter() {
        return wrongAnswerCounter++;
    }

    public void setUserLanguage(Language userLanguage){
        this.userLanguage = userLanguage;
    }

    public void setTimer() {
        timer = new Timer();
        ticksLeft = MAX;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.setImplicitExit(false);
                Platform.runLater(() -> timerCallback.accept(ticksLeft));
                ticksLeft--;
                //System.out.println(ticksLeft);
                if (ticksLeft == 0) {
                    timer.cancel();
                }
            }

        }, 1000, 1000);
    }

    public void setTimerCallback(Consumer<Integer> timerCallback) {
        this.timerCallback = timerCallback;
    }
}


