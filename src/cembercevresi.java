import java.util.Scanner;

public class cembercevresi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap değerini giriniz:");
        int yaricap = input.nextInt();
        int pi = 3;
        int cevre = 2*pi*yaricap;
        System.out.println("Cember cevresi :" + cevre);

    }
}
