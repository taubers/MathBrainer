package exercises;

public class ThreeArgumentExercise extends AbstractExercise {
    private int thirdNumber;
    private static final String[] SECOND_OPERATOR_LIST = {"*", "/"};
    private String secondOperator;

    public ThreeArgumentExercise(Level level) {
        super(level);
    }


    @Override
    protected void initializeOperator() {
        int operatorIndex = rand.nextInt(SECOND_OPERATOR_LIST.length);
        secondOperator = SECOND_OPERATOR_LIST[operatorIndex];
    }

    @Override
    protected ExerciseParams initializeExerciseParams(Level level) {
        switch (level) {
            case LEVEL_4 -> {
                return new ExerciseParams(80, 200, 2, 20);
            }
            case LEVEL_5 -> {
                return new ExerciseParams(150, 300, 2, 25);
            }
            case LEVEL_6 -> {
                return new ExerciseParams(190, 900, 4, 32);
            }
            case LEVEL_7 -> {
                return new ExerciseParams(190, 900, 4, 35);
            }
            default -> {
                throw new IllegalStateException();
            }
        }
    }

    @Override
    protected void calculateExpectedResult() {
        result = Integer.parseInt(getFirstNumber() + getOperator() + getSecondNumber() + secondOperator + thirdNumber);
    }

    @Override
    public String getExpression() {
        return getFirstNumber() + " " + getOperator() + " " + getSecondNumber() + " " + secondOperator + " " + thirdNumber;
    }
}
