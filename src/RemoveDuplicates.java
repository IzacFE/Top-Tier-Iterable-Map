import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] input = new int[]{2, 3, 3, 3, 6, 9, 9};
        Set<Integer> result = new LinkedHashSet<>();

        for (int i = 0; i < input.length; i++){
            result.add(input[i]);
        }

        int length = result.size();
        System.out.println(length);
    }
}
