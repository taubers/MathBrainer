package development;

public class AdditionExercise extends AbstractExercise {

    @Override
    protected void initializeOperator() {
        operator = "+";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() + getSecondNumber();
    }


}

