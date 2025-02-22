package Step6.Step6_Link0_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
Дан массив с числами. Нужно посчитать количество вхождений каждого числа в массив

Input: [1, 2, 1, 3, 2, 4]

 */
public class Main {
    public static void main(String[] args) {
        int[] input = new int[] {1, 2, 1, 3, 2, 4};
        calculateNumbersCount(input);
    }

    public static void calculateNumbersCount(int[] input) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: input) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        System.out.println(map);
    }
}
