import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka:");
        int angka = input.nextInt();
        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " angka genap");

        } else {
            System.out.println("Angka " + angka + " angka ganjil");
        }
        input.close();
    }

}
