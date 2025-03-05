import java.util.Scanner;
import java.time.LocalDate;

public class UserDataInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        String jenisKelamin;
        while (true) {
            System.out.print("Masukkan jenis kelamin (P/L): ");
            jenisKelamin = scanner.nextLine().toUpperCase();

            if (jenisKelamin.equals("P") || jenisKelamin.equals("L")) {
                break;
            } else {
                System.out.println("Input jenis kelamin salah. Harap masukkan 'P' atau 'L'.");
            }
        }

        int tahunLahir;
        while (true) {
            System.out.print("Masukkan tahun lahir: ");
            try {
                tahunLahir = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Input tahun lahir tidak valid. Harap masukkan angka.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        int tahunSaatIni = LocalDate.now().getYear();
        int umur = tahunSaatIni - tahunLahir;

        System.out.println("\nData Diri:");
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin.equals("L") ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur        : " + umur + " tahun");

        scanner.close();
    }
}