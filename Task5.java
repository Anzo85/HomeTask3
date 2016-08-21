// - Найти сумму первых n элементов массива
public class Task5 {

    public static final int N = 5;

    public static void main(String[] args) {

        arraySum();

    }

    public static void arraySum() {

        try {

            int[] array = {3, 4, 5, 7, 6};

            int sum = 0;

            for (int i = 0; i < N; i++) {

                sum = sum + array[i];

            }
            System.out.println(sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" N argument higher than array length");
        }
    }
}