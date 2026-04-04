package praktik;
import java.util.Scanner;

public class latihan {
    public static void main(String[] args){

        float Presensi, Tugas, nTugas, UTS, nUTS, UAS, nUAS, realisasi, kehadiran;
        float total;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukin realiasi mata kuliahnya: ");
        realisasi = input.nextFloat();
        //S1
        System.out.print("Masukin kehadiran kamu: ");
        kehadiran = input.nextFloat();

        System.out.print("Masukin Nilai tugas kamu: ");
        nTugas = input.nextFloat();

        System.out.print("Masukin Nilai UTS kamu: ");
        nUTS = input.nextFloat();

        System.out.print("Masukin Nilai UAS kamu: ");
        nUAS = input.nextFloat();

        //P1
        Presensi = kehadiran/realisasi * 10/100;
        Tugas = nTugas * 20/100;
        UTS = nUTS * 30/100;
        UAS = nUAS * 40/100;
        total = Presensi + Tugas + UTS + UAS;
        //S2
        System.out.println("==============================");
        System.out.println("KEHADIRAN | TUGAS | UTS | UAS");
        System.out.println("==============================");
        System.out.println("   " + kehadiran + "   | " + Tugas + "  | " + UTS + " |  " + UAS);
        System.out.println("             TOTAL            ");
        System.out.println("            " + total + "        ");




    }

}