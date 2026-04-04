package praktik;
import java.util.Scanner;

public class latihan {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        String nama;
        int usia;

        System.out.print("masukkan nama anda: ");
        nama = input.nextLine();
        System.out.print("berapa usianya: ");
        usia = input.nextInt();

        System.out.println("===============================");
        System.out.println("HALLO " + nama);
        System.out.println("umur anda " + usia + " yaa");

    }
}