import java.util.Random;

public class Average {
    void createArraySumAndAverage(int size) {
        int[] sumAndAverage = new int[size];
        Random random = new Random();
        for (int i=0;i<sumAndAverage.length;i++){

            sumAndAverage[i]=random.nextInt(0,101);
        }
        for (int i=0;i<sumAndAverage.length;i++)
    }
}
