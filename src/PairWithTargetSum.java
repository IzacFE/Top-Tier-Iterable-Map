import java.util.ArrayList;
import java.util.Arrays;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        int arrLength = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arrLength; i++) {
            int sisaTarget = target - arr[i];
            int indexSolusi = Arrays.binarySearch(arr,sisaTarget);
            if(indexSolusi>=0){
                result.add(i);
                result.add(indexSolusi);
                break;
            }
        }

        System.out.println(result);
    }
}
