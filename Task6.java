// Найти минимальный и максимальный элемент массива
public class Task6 {
    public static void main(String[] args) {


        minMax();

    }

    public static void minMax() {
        int[] array = {4, 7, 10, 11, 9, 3};

        int max = array[0];
        int min = array[0];


        for (int i = 1; i != array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }

        }

        System.out.println("MAX = " + max + " MIN = " + min);
    }
}
