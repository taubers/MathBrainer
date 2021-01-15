package development;

import exercises.AbstractExercise;
import exercises.ExerciseFactory;
import javafx.application.Platform;

import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;

public class MathBrainerModel {
    Timer timer = new Timer();

    public enum State {SOLVING, SOLVED}

    protected State solutionStatus;
    protected AbstractExercise exercise;
    public int correctAnswerCounter;
    public int wrongAnswerCounter;
    private static final int MAX = 10; // A maximal number used to determine the starting point of a countdown of timers
    private int ticksLeft;
    private Consumer<Integer> timerCallback;

    public void toSolving() {
        solutionStatus = State.SOLVING;
        exercise = ExerciseFactory.getExercise();
        setTimer();

    }

    public void toSolved() {
        solutionStatus = State.SOLVED;
        timer.cancel();
    }

    public void setTimer(){
        ticksLeft = MAX;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.setImplicitExit(false);
                Platform.runLater(() -> timerCallback.accept(ticksLeft));
                ticksLeft--;
                System.out.println(ticksLeft);
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


