//- Найти все счастливые билеты от 100000 до 999999 :
//        билет счастливый если сумма первых трех цифр равна сумме трех последних
//        например,  123312: 1+2+3==3+1+2

public class Task8 {


    public static void main(String[] args) {

        int count = 0;
        for (int i = 100000; i < 1000000; i++) {


            int n1 = i / 100000;
            int n2 = (i / 10000) % 10;
            int n3 = (i / 1000) % 10;

            int n4 = (i / 100) % 10;
            int n5 = (i / 10) % 10;
            int n6 = i % 10;


            int firstHalf = n1 + n2 + n3;
            int secondHalf = n4 + n5 + n6;

            if (firstHalf == secondHalf) {
                System.out.println("Lucky ticket: " + i);
                count++;


            }


        }

        System.out.println(" total amount lucky tickets : " + count);
    }
}
