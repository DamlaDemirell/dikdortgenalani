import java.util.Scanner;

public class dikdortgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kısa kenarı giriniz:");
        int kısaKenar = input.nextInt();
        System.out.print("Uzun kenarı giriniz:");
        int uzunKenar = input.nextInt();
        int cevre = 2*kısaKenar*uzunKenar;
        System.out.println("Dikdörtgen Alan değeri:" + cevre);

    }
}
