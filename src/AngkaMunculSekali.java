import java.util.ArrayList;
import java.util.HashSet;

public class AngkaMunculSekali {
    public static void main(String[] args) {
        String input = "76523752";
        int length = input.length();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i<length; i++) {
            boolean dummy = true;
            int check = Character.getNumericValue(input.charAt(i));
            for (int j = 0; j < length; j++) {
                int value = Character.getNumericValue(input.charAt(j));
                if (check == value && i != j) {
                    dummy = false;
                    break;
                }
            }
            if (dummy) {
                result.add(check);
            }
        }

        System.out.println(result);
    }
}
