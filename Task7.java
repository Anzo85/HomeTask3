//- Найти сумму всех четных и сумму всех нечетных элементов массива

public class Task7 {

    public static void main(String[] args) {

        evenOddd();


    }

    public static void evenOddd() {

        int[] array = {6, 3, 9, 4, 8, 1};

        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                x = x + array[i];
            }

            if (array[i] % 2 != 0) {
                y = y + array[i];
            }

        }

        System.out.println("sum even number: " + x + " sum odd number : " + y);
    }

}
