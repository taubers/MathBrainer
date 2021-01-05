package development;

import java.util.Random;

public abstract class AbstractExercise {

    Random rand = new Random();

    protected static final int MIN = 2;
    protected static final int MAX = 100;
    protected int firstNumber;
    protected int secondNumber;
    protected String operator;
    protected int result;
    protected int level;


    public AbstractExercise() {
        initializeArguments();
        initializeOperator();
        calculateExpectedResult();
    }


    protected void initializeArguments() {
        firstNumber = rand.nextInt(MAX - MIN) + MIN;
        secondNumber = rand.nextInt(MAX - MIN) + MIN;
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


