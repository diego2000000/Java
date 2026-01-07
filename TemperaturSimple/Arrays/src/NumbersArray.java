public class NumbersArray {
   private int[] numbers = {-8, 92, 53, 24, 2, 35, -50, 77, 12, -20};

    int calculateSumOfArray() {

        int result = 0;
        for (int t : numbers) {
            result += t;
        }
        return result;
    }
    int calculateArraySumOfNegativeNumbers(){

        int result=0;
        for (int t :numbers){
            if (t<0){
                result+=t;
            }
        }
        return result;
    }

    int calculateArraySumOfPositiveNumbers(){

        int result=0;
        for (int t :numbers){
            if (t>0){
                result+=t;
            }
        }
        return result;
    }
}
