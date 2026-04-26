package Latihan;

import java.util.Scanner;

public class latihan1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== APLIKASI PENILAIAN AKADEMIK =====");

        System.out.print("Jumlah pertemuan semester : ");
        int totalPertemuan = sc.nextInt();

        System.out.print("Jumlah kehadiran mahasiswa : ");
        int jumlahHadir = sc.nextInt();

        System.out.print("Nilai tugas : ");
        double nilaiTugas = sc.nextDouble();

        System.out.print("Nilai UTS : ");
        double nilaiUTS = sc.nextDouble();

        System.out.print("Nilai UAS : ");
        double nilaiUAS = sc.nextDouble();

        sc.close();

        double persenKehadiran = hitungKehadiran(totalPertemuan, jumlahHadir);

        double nilaiFinal = hitungNilaiAkhir(
                persenKehadiran,
                nilaiTugas,
                nilaiUTS,
                nilaiUAS
        );

        String indeks = prosesGrade(persenKehadiran, nilaiFinal);

        if (persenKehadiran < 75) {
            if (nilaiFinal >= 55) {
                nilaiFinal = 55;
            }
        }

        tampilkanHasil(persenKehadiran, nilaiFinal, indeks);
    }


    static double hitungKehadiran(int total, int hadir) {

        return (hadir * 100.0) / total;
    }


    static double hitungNilaiAkhir(
            double hadir,
            double tugas,
            double uts,
            double uas
    ) {

        return (hadir * 0.10)
                + (tugas * 0.20)
                + (uts * 0.30)
                + (uas * 0.40);
    }


    static String prosesGrade(double hadir, double nilai) {

        if (hadir < 75) {

            System.out.println(
                    "\n[PERHATIAN] Kehadiran kurang dari 75%."
            );

            if (nilai >= 55) {
                return "D";
            }

            return "E";
        }

        if (nilai >= 80) return "A";
        if (nilai >= 70) return "B";
        if (nilai >= 60) return "C";
        if (nilai >= 55) return "D";

        return "E";
    }


    static void tampilkanHasil(
            double hadir,
            double nilai,
            String grade
    ) {

        System.out.println("\n===== REKAP NILAI =====");

        System.out.printf(
                "Persentase hadir : %.2f%%\n",
                hadir
        );

        System.out.printf(
                "Nilai akhir      : %.2f\n",
                nilai
        );

        System.out.println(
                "Indeks huruf     : " + grade
        );

        System.out.println("=======================");
    }
}