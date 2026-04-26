package tugas;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args){

        float Presensi, Tugas, UTS, UAS;
        float realisasi, kehadiran;
        float nTugas, nUTS, nUAS;
        float total, persenHadir;
        String grade;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukin realisasi mata kuliahnya: ");
        realisasi = input.nextFloat();

        // S1
        System.out.print("Masukin kehadiran kamu: ");
        kehadiran = input.nextFloat();

        System.out.print("Masukin Nilai tugas kamu: ");
        nTugas = input.nextFloat();

        System.out.print("Masukin Nilai UTS kamu: ");
        nUTS = input.nextFloat();

        System.out.print("Masukin Nilai UAS kamu: ");
        nUAS = input.nextFloat();


        // Hitung persentase kehadiran
        persenHadir = (kehadiran / realisasi) * 100;

        // P1 (perhitungan bobot nilai)
        Presensi = persenHadir * 10 / 100;
        Tugas = nTugas * 20 / 100;
        UTS = nUTS * 30 / 100;
        UAS = nUAS * 40 / 100;

        total = Presensi + Tugas + UTS + UAS;


        // Penentuan Grade
        if (persenHadir < 75) {

            System.out.println("\n[PERINGATAN] Kehadiran kurang dari 75%!");

            if (total >= 55) {
                total = 55;
                grade = "D";
            } else {
                grade = "E";
            }

        } else {

            if (total >= 80) {
                grade = "A";
            } else if (total >= 70) {
                grade = "B";
            } else if (total >= 60) {
                grade = "C";
            } else if (total >= 55) {
                grade = "D";
            } else {
                grade = "E";
            }
        }


        // S2 Output
        System.out.println("==============================");
        System.out.println("KEHADIRAN | TUGAS | UTS | UAS");
        System.out.println("==============================");
        System.out.println("   " + persenHadir + "% | " + Tugas + " | " + UTS + " | " + UAS);
        System.out.println("-------------TOTAL-------------");
        System.out.println("Nilai Akhir : " + total);
        System.out.println("Grade       : " + grade);

        input.close();
    }
}