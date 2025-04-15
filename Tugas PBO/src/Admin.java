import java.util.Scanner;

public class Admin {
    public void login() {
        Scanner scanner = new Scanner(System.in);
        String username = "Admin125";
        String password = "126";

        System.out.print("Masukkan username Admin: ");
        String inputUser = scanner.nextLine();
        System.out.print("Masukkan password Admin: ");
        String inputPass = scanner.nextLine();

        if (inputUser.equals(username) && inputPass.equals(password)) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login Admin gagal!");
        }
    }
}
