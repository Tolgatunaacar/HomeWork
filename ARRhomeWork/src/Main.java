
import java.util.Arrays;

public class Main {

    static  boolean isThere(int[] arr, int y){
        for (int i : arr){
            if (i == y){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] list = {2, 3, 52, 35, 98, 65, 14, 52, 71, 2, 98, 65, 75, 35};

        int[] list2 = new int[list.length];

        int x = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {

                if (i != j && list[i] == list[j]) {
                    if (i % 2 == 0) {
                        if (!isThere(list2,list[i])){
                            list2[x++] = list[i];
                        }
                       break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(list2));
    }
}

