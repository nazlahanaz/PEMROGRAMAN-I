import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        int totalSemua = 0;

        do {
            System.out.println("=== Input Nilai Mahasiswa ===");

            System.out.print("Nilai Matkul 1: ");
            int m1 = input.nextInt();

            System.out.print("Nilai Matkul 2: ");
            int m2 = input.nextInt();

            System.out.print("Nilai Matkul 3: ");
            int m3 = input.nextInt();

            int total = m1 + m2 + m3;
            System.out.println("Total nilai mahasiswa ini: " + total);

            totalSemua += total;

            System.out.print("Input mahasiswa lagi? (y/t): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Total semua nilai mahasiswa: " + totalSemua);
    }
}