package unused;

public class ExerciseParams {
    private final int min1;
    private final int min2;
    //private final int min3;
    //private final int min4;

    private final int max1;
    private final int max2;

    //private final int max4;

    public ExerciseParams(int min1, int max1, int min2, int max2/*, int min3, int max3*/) {
        this.min1 = min1;
        this.max1 = max1;
        this.min2 = min2;
        this.max2 = max2;

    }

    public int getMax1() {
        return max1;
    }

    public int getMax2() {
        return max2;
    }

    public int getMin1() {
        return min1;
    }

    public int getMin2() {
        return min2;
    }


}
