import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayMerge {
    public static void main(String[] args) {
        String[] firstArray = new String[]{"kazuya", "jin", "lee"};
        String[] secondArray = new String[]{"kazuya", "feng"};
        Set<String> result = new LinkedHashSet<>();

        for (int i = 0; i < firstArray.length; i++){
            result.add(firstArray[i]);
        }

        for (int j = 0; j < secondArray.length; j++){
            result.add(secondArray[j]);
        }

        System.out.println(result);
    }
}
