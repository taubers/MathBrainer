package exercises;

public class MultiplicationExercise extends AbstractExercise {

    public MultiplicationExercise(Level level) {
        super(level);
    }

    @Override
    protected void initializeOperator() {
        operator = Operator.MULTIPLY;
    }


    @Override
    protected ExerciseParams initializeExerciseParams(Level level) {
        switch (level) {
            case LEVEL_2 -> {
                return new ExerciseParams(2, 10, 2, 10);
            }
            case LEVEL_3 -> {
                return new ExerciseParams(5, 20, 12, 20);
            }
            case LEVEL_4 -> {
                return new ExerciseParams(5, 25, 12, 20);
            }
            case LEVEL_5 -> {
                return new ExerciseParams(11, 25, 12, 25);
            }
            case LEVEL_6 -> {
                return new ExerciseParams(15, 30, 12, 30);
            }
            case LEVEL_7 -> {
                return new ExerciseParams(15, 35, 12, 30);
            }
            default -> {
                throw new IllegalStateException();
            }
        }
    }

}
