import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        double a = input.nextDouble();

        System.out.print("Masukkan angka kedua   : ");
        double b = input.nextDouble();

        System.out.println("\n=== Hasil Operasi ===");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));

        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Pembagian tidak bisa dilakukan (pembagi = 0)");
        }

        input.close();
    }
}