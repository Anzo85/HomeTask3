
// - Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class Task2 {


    public static void main(String[] args) {

        printDigits();


    }

    public static void printDigits() {
        int x = -1;
        for (int i = 1; i < 55; i++) {
            System.out.println(x = x + 2);
        }

    }
}
