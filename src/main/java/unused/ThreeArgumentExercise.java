/*
package unused;


import exercises.AbstractExercise;
import exercises.Level;
import exercises.Operator;

public class ThreeArgumentExercise extends AbstractExercise {

    private static final Operator[] FIRST_OPERATOR_LIST = {Operator.ADD, Operator.SUBTRACT};
    private static final Operator[] SECOND_OPERATOR_LIST = {Operator.MULTIPLY, Operator.DIVIDE};
    private Operator secondOperator;
    private int thirdNumber;

    public ThreeArgumentExercise(Level level) {
        super(level);
    }

   */
/* @Override
    protected void initializeArguments(ThreeExerciseParams params) {
        super.initializeArguments(params);
        thirdNumber = rand.nextInt((20 - 2) + 1) + 2;
    }*//*


    @Override
    protected void initializeOperator() {
        int firstOperatorIndex = rand.nextInt(FIRST_OPERATOR_LIST.length);
        int secondOperatorIndex = rand.nextInt(SECOND_OPERATOR_LIST.length);

        operator = FIRST_OPERATOR_LIST[firstOperatorIndex];
        secondOperator = SECOND_OPERATOR_LIST[secondOperatorIndex];
    }

   */
/* @Override
    protected ExerciseParams initializeExerciseParams(Level level) {
        switch (level) {
            case LEVEL_4 -> {
                return new ThreeExerciseParams(2, 3);
            }
            case LEVEL_5 -> {
                return new ThreeExerciseParams(150, 300);
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
    }*//*


    @Override
    // Returns a String of the expression to UI with modified operation
    public String getExpression() {
        return getFirstNumber() + " " + (getOperator().uiOperator()) + " " + getSecondNumber() + " " + secondOperator.uiOperator() + " " + thirdNumber;
    }

    @Override
    protected void calculateExpectedResult() {
        //result = Operator.e(getFirstNumber(), operator, Operator.e(getSecondNumber(), secondOperator, thirdNumber));

    }


}*/
