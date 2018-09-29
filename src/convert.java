import java.util.Scanner;

public class convert {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int yourInt = in.nextInt();
        int b;
        String result = "";
        System.out.println("подходит под:");
        if ((yourInt<=127) && (yourInt>=-128))
            System.out.println("тип данных byte");
        if ((yourInt>=-32768) && (yourInt<=32768))
            System.out.println("тип данных short");
        if ((yourInt>=-1474836482) && (yourInt<=2147483647))
            System.out.println("тип данных integer");
        if ((yourInt>=-147483648)||(yourInt>2147483647))
            System.out.println("тип данных long");
        else System.out.println("WHat?");
        System.out.println();
        while (yourInt != 0) {
            b = yourInt % 2;
            result += b;
            yourInt /= 2;
        }
        System.out.println("Ваше число в бинарном виде: " + result);

    }
}