package exercises;


public class DivisionExercise extends AbstractExercise {
    public DivisionExercise(ExerciseParams params) {
        super(params);
    }
    //long start;
    //long finish;

   @Override
    protected void initializeArguments(int min1, int max1, int min2, int max2) {
      //  this.start = System.nanoTime();
      //  int counter = 0;


        int a;
        int b;


        do {
            a = rand.nextInt((max1 - min1) +1 ) + min1;
            b = rand.nextInt((max2 - min2) +1 ) + min2;
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


