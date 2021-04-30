package exercises;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ThreeArgumentExercise extends AbstractExercise {
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");


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


    @Override
    protected void calculateExpectedResult() {
        try {
            result = ((Number) scriptEngine.eval(getExpression())).intValue();
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }


    public String getExpression() {
        return getFirstNumber() + " " + firstOperator + " " + getSecondNumber() + " " + secondOperator + " " + thirdNumber;
    }


}