package Tugas;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        int total = 0, jumlah = 0;

        do {
            System.out.print("Masukkan nilai: ");
            int nilai = input.nextInt();

            total += nilai;
            jumlah++;

            System.out.print("Ulangi? (y/t): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        double rata = (double) total / jumlah;
        System.out.println("Rata-rata nilai: " + rata);
    }
}