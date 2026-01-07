import java.util.Random;

public class Arraysorting {

    void createRandomFilledOfArray(int size) {

        int[] sorting = new int[size];
        Random randomHundredPoseNeg = new Random();
        for (int i = 0; i < sorting.length; i++) {

            sorting[i] = randomHundredPoseNeg.nextInt(-100, 101);
        }
        for (int i2 = 0; i2 < sorting.length; i2++) {
            for (int i1 = 1; i1 < sorting.length; i1++) {
                int compare = sorting[i1 - 1];
                if (compare > sorting[i1]) {
                    int move = sorting[i1];
                    sorting[i1 - 1] = move;
                    sorting[i1] = compare;
                }
            }
        }
        for (int print : sorting) {
            System.out.print(print + " ");
        }
    }
}
