package development;

import UI.languges.English;
import UI.languges.German;
import UI.languges.Latvian;
import UI.languges.Russian;
import exercises.AbstractExercise;
import exercises.ExerciseFactory;
import javafx.application.Platform;

import java.util.*;
import java.util.function.Consumer;

public class MathBrainerModel {
    UI.languges.Language language = new UI.languges.Language();

    protected enum State {SOLVING, SOLVED}

    protected enum Language {LATVIAN, RUSSIAN, ENGLISH, GERMAN}

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


    //Language

    Map<String, Language> languageMap;

    {
        languageMap = new HashMap<>();

        languageMap.put("en", MathBrainerModel.Language.ENGLISH);
        languageMap.put("de", MathBrainerModel.Language.GERMAN);
        languageMap.put("lv", MathBrainerModel.Language.LATVIAN);
        languageMap.put("ru", MathBrainerModel.Language.RUSSIAN);

        Locale currentLocale = Locale.getDefault();
        userLanguage = languageMap.get(currentLocale.getLanguage());

    }

    public void getUserLanguage() {
        switch (userLanguage) {
            case ENGLISH -> {
                language = new English();
            }
            case LATVIAN -> {
                language = new Latvian();
            }
            case RUSSIAN -> {
                language = new Russian();
            }
            case GERMAN -> {
                language = new German();
            }
        }
        return;
    }


    // Timer
    public void setTimer() {
        //TODO simplify Timer Code
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


