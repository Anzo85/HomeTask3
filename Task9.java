//- Перевести число в двоичную систему счисления
public class Task9 {


    public static void main(String[] args) {

        transfer(9);

    }

    public static void transfer(int i) {

        int b;
        String c = " ";

        while (i != 0) {

            b = i % 2;
            c = b + c;
            i = i / 2;
        }
        System.out.println(c);
    }
}
