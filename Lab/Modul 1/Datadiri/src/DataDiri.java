import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.nextLine().toUpperCase().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        String jenisKelaminLengkap;
        if (jenisKelamin == 'L') {
            jenisKelaminLengkap = "Laki-laki";
        } else if (jenisKelamin == 'P') {
            jenisKelaminLengkap = "Perempuan";
        } else {
            jenisKelaminLengkap = "Tidak valid";
        }

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        System.out.println("\nData Diri:");
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Umur         : " + umur + " tahun");

        scanner.close();
    }
}