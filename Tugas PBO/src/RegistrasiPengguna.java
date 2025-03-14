import java.util.Scanner;

public class RegistrasiPengguna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String adminUsername = "Admin125";
        String adminPassword = "126";
        
        String mahasiswaUsername = "Adi Purwito";
        String mahasiswaPassword = "202410370110530";

        while (true) {
            System.out.println("Pilihan:");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Mahasiswa");
            System.out.print("Masukkan pilihan : ");
            
            String pilihan = scanner.nextLine().trim();
            
            if (!pilihan.equals("1") && !pilihan.equals("2")) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }
            
            if (pilihan.equals("1")) {
                System.out.print("Masukkan username: ");
                String inputUsername = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String inputPassword = scanner.nextLine();
                
                if (inputUsername.equals(adminUsername) && inputPassword.equals(adminPassword)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal!");
                }
            } 
            else if (pilihan.equals("2")) {
                System.out.print("Masukkan username: ");
                String inputUsername = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String inputPassword = scanner.nextLine();
                
                if (inputUsername.equals(mahasiswaUsername) && inputPassword.equals(mahasiswaPassword)) {
                    System.out.println("Login Mahasiswa berhasil!");
                } else {
                    System.out.println("Login gagal!");
                }
            }
        }
    }
}