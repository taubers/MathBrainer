package exercises;


public class ThreeArgumentExercise extends AbstractExercise {

    private static final Operator[] FIRST_OPERATOR_LIST = {Operator.ADD, Operator.SUBTRACT};
    private static final Operator[] SECOND_OPERATOR_LIST = {Operator.MULTIPLY, Operator.DIVIDE};
    private Operator secondOperator;
    private int thirdNumber = rand.nextInt((20 - 2) + 1) + 2;

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
        return getFirstNumber() + " " + transformOperator(getOperator()) + " " + getSecondNumber() + " " + transformOperator(secondOperator) + " " + thirdNumber;
    }

    @Override
    protected void calculateExpectedResult() {
        result = e(getFirstNumber(), operator, e(getSecondNumber(), secondOperator, thirdNumber));
    }


}