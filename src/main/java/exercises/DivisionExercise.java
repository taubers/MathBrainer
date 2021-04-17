package exercises;


public class DivisionExercise extends AbstractExercise {
    public DivisionExercise(Level level) {
        getDivisionExerciseParams(level);
    }


    //long start;
    //long finish;

   @Override
    protected void initializeArguments(ExerciseParams params) {
      //  this.start = System.nanoTime();
      //  int counter = 0;


        int a;
        int b;


        do {
            a = rand.nextInt((params.getMax1() - params.getMin1()) +1 ) + params.getMin1();
            b = rand.nextInt((params.getMax2() - params.getMin2()) +1 ) + params.getMin2();
            //counter++;

        } while (a == 0 || b == 0 || a % b != 0 || b >= a);


        firstNumber = a;
        secondNumber = b;


        //this.finish = System.nanoTime();
        //logRandomTrials(counter);

    }


    @Override
    protected void initializeOperator() {
        operator = "÷";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() / getSecondNumber();
    }



    public ExerciseParams getDivisionExerciseParams(Level level) {
        switch (level){
            case LEVEL_2 -> {
                exerciseParams = new ExerciseParams(2,10, 2, 10);
                break;
            }
            case LEVEL_3 -> {
                exerciseParams = new ExerciseParams(80,200, 2, 15);
                break;
            }
            case LEVEL_4 -> {
                exerciseParams = new ExerciseParams(80,200, 2, 20);
                break;
            }
            case LEVEL_5 -> {
                exerciseParams = new ExerciseParams(150,300, 2, 25);
                break;
            }
            case LEVEL_6 -> {
                exerciseParams = new ExerciseParams(190,900, 4, 32);
                break;
            }
            case LEVEL_7 -> {
                exerciseParams = new ExerciseParams(190,900, 4, 35);
                break;
            }
            default -> {
                throw new IllegalStateException();
            }
        }

        return exerciseParams;
    }

    /*private void logRandomTrials(int counter) {
        Date date = new Date();
        BufferedWriter bw;
        DecimalFormat df = new DecimalFormat("#.#########");
        df.setRoundingMode(RoundingMode.CEILING);
        long timeElapsed = finish - start;
        double timeElapsedSeconds = (double) timeElapsed / 1000000000;

        System.out.println("\nVienādojums uzģenerēts ar " + counter + " mēģinājumiem " + timeElapsed + " nanosekundēs" + " jeb " + df.format(timeElapsedSeconds) + " sekundēs!\n");

        //Operations to store Random trials of generating valid numbers for division into a text file
        try {
            bw = new BufferedWriter(new FileWriter("output/RandomTrialsForDivisionExercise.txt", true));
            bw.write(counter + " trials on " + date.toString() + " within " + timeElapsed + " nanoseconds" + " or " + df.format(timeElapsedSeconds) + " seconds\n");
            bw.close();
        } catch (IOException exception) {
            System.err.println("Could not process the operation" + exception.getMessage());
        }
    }*/
}


