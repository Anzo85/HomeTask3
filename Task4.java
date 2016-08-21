// - Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….


public class Task4 {
    public static void main(String[] args) {

        twentyElements();
    }

    public static void twentyElements() {
        int x = 2;
        System.out.println(x);
        for (int i = 1; i < 20; i++) {

            System.out.println(x = (x + x));
        }
    }
}
