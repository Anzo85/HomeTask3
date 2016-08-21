
//- Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

public class Task3 {

    public static void main(String[] args) {

        countDown();

    }

    public static void countDown() {

        int x = 95;
        while (x > 0) {
            System.out.println(x = x - 5);
        }
    }
}
