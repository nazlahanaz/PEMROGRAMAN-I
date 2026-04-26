package Latihan;
import java.util.Scanner;

public class latihan2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("===== SISTEM PERHITUNGAN NILAI MAHASISWA =====");

        System.out.print("Jumlah total pertemuan: ");
        int totalPertemuan = scan.nextInt();

        double persenHadir = 0;
        double nilaiAkhir = 0;
        String hurufMutu = "-";

        System.out.print("\nKetik 1 untuk lanjut input nilai, selain itu batal: ");
        int opsi = scan.nextInt();

        if (opsi != 1) {

            System.out.println("\nInput dibatalkan oleh user.");
            hurufMutu = "E (Tidak diproses)";

        } else {

            int hadir;

            do {
                System.out.print("Masukkan jumlah hadir: ");
                hadir = scan.nextInt();

                persenHadir = (hadir * 100.0) / totalPertemuan;

                if (persenHadir < 75) {
                    System.out.println("Kehadiran kurang dari 75% ("
                            + String.format("%.2f", persenHadir)
                            + "%). Silakan ulangi.");
                }

            } while (persenHadir < 75);

            System.out.print("Nilai tugas: ");
            double tugas = scan.nextDouble();

            System.out.print("Nilai UTS: ");
            double uts = scan.nextDouble();

            System.out.print("Nilai UAS: ");
            double uas = scan.nextDouble();

            nilaiAkhir = hitungNilai(persenHadir, tugas, uts, uas);

            hurufMutu = tentukanGrade(nilaiAkhir);
        }

        scan.close();

        System.out.println("\n===== HASIL PENILAIAN =====");
        System.out.printf("Persentase hadir : %.2f%%\n", persenHadir);
        System.out.printf("Nilai akhir      : %.2f\n", nilaiAkhir);
        System.out.println("Grade            : " + hurufMutu);
        System.out.println("===========================");
    }


    static double hitungNilai(double hadir, double tugas, double uts, double uas) {

        double nilai =
                (hadir * 0.10) +
                        (tugas * 0.20) +
                        (uts * 0.30) +
                        (uas * 0.40);

        return nilai;
    }


    static String tentukanGrade(double nilai) {

        if (nilai >= 80) return "A";
        if (nilai >= 70) return "B";
        if (nilai >= 60) return "C";
        if (nilai >= 55) return "D";

        return "E";
    }
}