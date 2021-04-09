package exercises;

import java.util.Random;

public abstract class AbstractExercise {
    private ExerciseParams params;

    public Random rand = new Random();


    //protected static final int MIN = 2;
    //protected static final int MAX = 100;
    protected int firstNumber;
    protected int secondNumber;
    protected String operator;
    protected int result;


    public AbstractExercise(ExerciseParams params) {
        this.params = params;
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


