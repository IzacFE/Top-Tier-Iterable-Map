import java.util.ArrayList;

public class ArrayUnique {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 2, 3, 4};
        int[] arrayB = new int[]{1, 3, 5, 10, 16};
        int pjgArrA = arrayA.length;
        int pjgArrB = arrayB.length;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < pjgArrA; i++) {
            int check = arrayA[i];
            int dummy = 0;
            for (int j = 0; j < pjgArrB; j++) {
                if (check == arrayB[j]) {
                    break;
                }else if(arrayA[i]!=arrayB[j]){
                    dummy+=1;
                }

                if (dummy == pjgArrB) {
                    result.add(check);
                }
            }
        }

        System.out.println(result);
    }
}
