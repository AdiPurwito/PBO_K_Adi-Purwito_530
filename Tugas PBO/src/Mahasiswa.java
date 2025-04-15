import java.util.Scanner;

public class Mahasiswa {
    public void login() {
        Scanner scanner = new Scanner(System.in);
        String username = "Adi Purwito";
        String password = "202410370110530";
        String pic = "0987654321";

        System.out.print("Masukkan username Mahasiswa: ");
        String inputUser = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String inputPass = scanner.nextLine();
        System.out.print("Masukkan PIC Anda: ");
        String inputPIC = scanner.nextLine();

        if (inputUser.equals(username) && inputPass.equals(password) && inputPIC.equals(pic)) {
            System.out.println("Login Mahasiswa berhasil!");
        } else {
            System.out.println("Login Mahasiswa gagal!");
        }
    }
}