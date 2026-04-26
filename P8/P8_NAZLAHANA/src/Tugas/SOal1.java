package Tugas;
import java.util.Scanner;

    public class SOal1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            char ulang;

            do {
                System.out.print("Masukkan nilai: ");
                int nilai = input.nextInt();

                System.out.println("Nilai yang diinput: " + nilai);

                System.out.print("Ulangi? (y/t): ");
                ulang = input.next().charAt(0);

            } while (ulang == 'y' || ulang == 'Y');
        }
    }

