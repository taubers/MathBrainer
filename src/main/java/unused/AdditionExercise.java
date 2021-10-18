package unused;

import exercises.AbstractExercise;
import exercises.Level;
import exercises.Operator;

public class AdditionExercise extends AbstractExercise {

    public AdditionExercise(Level level) {
        super(level);
    }

    @Override
    protected void initializeOperator() {
        operator = Operator.ADD;
    }

    @Override
    public ExerciseParams initializeExerciseParams(Level level) {
        switch (level) {
            case LEVEL_1, LEVEL_2 -> {
                return new ExerciseParams(2, 10, 2, 10);
            }
            case LEVEL_3 -> {
                return new ExerciseParams(20, 900, 20, 900);
            }
            case LEVEL_4 -> {
                return new ExerciseParams(15, 900, 15, 900);
            }
            case LEVEL_5 -> {
                return new ExerciseParams(120, 900, 120, 900);
            }
            case LEVEL_6 -> {
                return new ExerciseParams(300, 1200, 300, 1200);
            }
            case LEVEL_7 -> {
                return new ExerciseParams(300, 1500, 300, 1200);
            }
            default -> {
                throw new IllegalStateException();
            }
        }
    }
}

