package exercises;

// This Class is a second version of DivisionExercise class
// This class generates numbers instantly compared with DivisionExercise (which needs several attempts until valid numbers are generated)

public class SimplifiedDivisionExercise extends AbstractExercise {

    public SimplifiedDivisionExercise(ExerciseParams params) {
        super(params);
    }

    //@Override
    protected void initializeArguments() {
        secondNumber = rand.nextInt(MAX - MIN) + MIN;
        result = rand.nextInt(MAX - MIN) + MIN;
        firstNumber = secondNumber * result;
    }

    @Override
    protected void initializeOperator() {
       operator = "/";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() / getSecondNumber();
    }

}
