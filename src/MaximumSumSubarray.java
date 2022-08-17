import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] input = new int[]{2, 1, 5, 1, 3, 2};
        int subSize = 3;
        int arrLength = input.length;
        int iterate = arrLength - subSize;
        ArrayList<Integer> sumCollection = new ArrayList<>();

        for (int i = 0; i <= iterate; i++) {
            int[] check = Arrays.copyOfRange(input,i,i+subSize);
            int total = 0;
            for (int j = 0; j < subSize; j++) {
                total += check[j];
            }
            sumCollection.add(total);
        }

        int result = Collections.max(sumCollection);
        System.out.println(result);
    }
}
