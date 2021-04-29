package exercises;

public class ThreeArgumentExercise extends AbstractExercise {
    private int thirdNumber;
    private String[] secondOperator = new String[]{"*", "/"};

    public ThreeArgumentExercise(Level level) {
        super(level);
    }

    public int getThirdNumber() {
        return thirdNumber;
    }

    public String[] getSecondOperator() {
        return secondOperator;
    }

    @Override
    protected String initializeOperator() {
        int operatorIndex = rand.nextInt(secondOperator.length);
        return secondOperator[operatorIndex];
    }

    @Override
    protected ExerciseParams initializeExerciseParams(Level level) {
        return null;
    }

    @Override
    protected void calculateExpectedResult() {
        result = Integer.parseInt(firstNumber + operator + secondNumber + secondOperator + thirdNumber);
    }
}
