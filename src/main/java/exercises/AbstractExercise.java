package exercises;

import java.util.Random;

public abstract class AbstractExercise {
    private ExerciseParams params;

    protected Random rand = new Random();


    protected int firstNumber;
    protected int secondNumber;
    protected String operator;
    protected int result;


    public AbstractExercise() {
        initializeArguments(params);
        initializeOperator();
        calculateExpectedResult();
    }


    protected void initializeArguments(ExerciseParams params) {
        firstNumber = rand.nextInt((params.getMax1() - params.getMin1()) +1 ) + params.getMin1();
        secondNumber = rand.nextInt((params.getMax2() - params.getMin2()) +1 ) + params.getMin2();
    }

    protected abstract void initializeOperator();

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getResult() {
        return result;
    }

    public String getOperator() {
        return operator;
    }

    protected abstract void calculateExpectedResult();

}


