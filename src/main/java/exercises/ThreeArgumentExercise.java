package exercises;


public class ThreeArgumentExercise extends AbstractExercise {

    private int thirdNumber = 1;
    private static final String[] FIRST_OPERATOR_LIST = {"+", "-"};
    private static final String[] SECOND_OPERATOR_LIST = {"*", "/"};
    private String firstOperator;
    private String secondOperator;

    public ThreeArgumentExercise(Level level) {
        super(level);
    }


    @Override
    protected void initializeOperator() {
        int firstOperatorIndex = rand.nextInt(FIRST_OPERATOR_LIST.length);
        int secondOperatorIndex = rand.nextInt(SECOND_OPERATOR_LIST.length);

        firstOperator = FIRST_OPERATOR_LIST[firstOperatorIndex];
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

    public static int e(int arg1, String operator, int arg2) {

        switch (operator) {
            case "/" -> {
                return arg1 / arg2;
            }
            case "*" -> {
                return arg1 * arg2;
            }
            case "+" -> {
                return arg1 + arg2;
            }
            case "-" -> {
                return arg1 - arg2;
            }
            default -> {
                throw new IllegalStateException();
            }

        }
    }

    @Override
    protected void calculateExpectedResult() {
       result = e(getFirstNumber(),firstOperator,e(getSecondNumber(),secondOperator,thirdNumber));
    }


    public String getExpression() {
        return getFirstNumber() + " " + firstOperator + " " + getSecondNumber() + " " + secondOperator + " " + thirdNumber;
    }


}