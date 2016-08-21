

// Создайте программу, выводящую на экран все четырёхзначные числа последовательности
//        1000 1003 1006 1009 1012 1015 ….

public class Task1 {

    public static void main(String[] args) {


        fourDigits();


    }


    public static void fourDigits() {

        for (int x = 1000; x < 9999; x = x + 3) {


            System.out.println(x);
        }

    }

}

