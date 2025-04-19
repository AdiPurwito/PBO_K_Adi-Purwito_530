import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("::=====-- Pilih Login --=====::");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan (1/2): ");
        int pilihan = input.nextInt();

        User user;

        if (pilihan == 1) {
            user = new Admin();
        } else if (pilihan == 2) {
            user = new Mahasiswa();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        boolean loginSuccess = user.login();

        if (loginSuccess) {
            System.out.println("Login berhasil!");
            user.displayInfo();
        } else {
            System.out.println("Login gagal! Silakan coba lagi.");
        }
    }
}