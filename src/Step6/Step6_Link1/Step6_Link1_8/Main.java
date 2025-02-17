package Step6.Step6_Link1.Step6_Link1_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 8, 9, 63, 5, 4, 8, 5, -55, 87, 89};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array2));
    }

}
