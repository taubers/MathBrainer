package development;

public class MultiplicationExercise extends AbstractExercise {

    @Override
    protected void initializeOperator() {
        operator = "*";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() * getSecondNumber();
    }


}
