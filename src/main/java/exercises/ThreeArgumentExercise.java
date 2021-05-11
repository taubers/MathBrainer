package exercises;


public class ThreeArgumentExercise extends AbstractExercise {

    private int thirdNumber = 1;
    private static final String[] FIRST_OPERATOR_LIST = {"+", "-"};
    private static final String[] SECOND_OPERATOR_LIST = {"*", "/"};
    private String secondOperator;

    public ThreeArgumentExercise(Level level) {
        super(level);
    }


    @Override
    protected void initializeOperator() {
        int firstOperatorIndex = rand.nextInt(FIRST_OPERATOR_LIST.length);
        int secondOperatorIndex = rand.nextInt(SECOND_OPERATOR_LIST.length);

        operator = FIRST_OPERATOR_LIST[firstOperatorIndex];
        secondOperator = SECOND_OPERATOR_LIST[secondOperatorIndex];
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


    public String getExpression() {
        return getFirstNumber() + " " + getOperator() + " " + getSecondNumber() + " " + secondOperator + " " + thirdNumber;
    }

    @Override
    protected void calculateExpectedResult() {
        result = e(getFirstNumber(),operator,e(getSecondNumber(),secondOperator,thirdNumber));
    }


}