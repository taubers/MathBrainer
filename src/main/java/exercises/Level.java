package exercises;

public class Level {
    protected enum Levels {
        LEVEL_1(2, 10),
        LEVEL_2(2, 10),
        LEVEL_3(2, 900),
        LEVEL_4(2, 900),
        LEVEL_5(2, 900),
        LEVEL_6(4, 1800),
        LEVEL_7(4, 1800);

        protected Levels exerciseLevel;


        private int minNumber;
        private int maxNumber;

        Levels(int minNumber, int maxNumber) {
            this.minNumber = minNumber;
            this.maxNumber = maxNumber;
        }

        public int getMinNumber() {
            return minNumber;
        }

        public int getMaxNumber() {
            return maxNumber;
        }

        public Levels getExerciseLevel() {
            return exerciseLevel;
        }
    }
}
