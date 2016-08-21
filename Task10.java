// Вывести первые 5 минимальных элементов массива

import java.util.*;

public class Task10 {
    public static void main(String[] args) {


        min();

    }

    public static void min() {

        int[] array = {4, 7, 10, 11, 9, 3};
        String s = "";
        Arrays.sort(array);


        for (int i = 0; i < 5; i++) {

            s += array[i] + " ";

        }

        System.out.println(s);

    }


}

