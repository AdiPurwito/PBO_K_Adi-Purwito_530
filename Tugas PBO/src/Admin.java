import java.util.Scanner;

public class Admin extends User {
    private String username;
    private String password;

    // Constructor menggunakan super untuk menginisialisasi nama dan nim
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    public Admin() {
        super("Dr. Admin, S.T., M.T", "06475890");
        this.username = "Admin125";
        this.password = "126";
    }

    // Get & Set Usernama
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Get & Set Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Override mothod login
    @Override
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username Admin: ");
        String inputUser = scanner.nextLine();
        System.out.print("Masukkan password Admin: ");
        String inputPass = scanner.nextLine();

        return inputUser.equals(username) && inputPass.equals(password);
    }

    // Override mothod displayinfo
    @Override
    public void displayInfo() {
        System.out.println("=== Informasi Admin ===");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
        System.out.println("Username: " + username);
        System.out.println("Login sebagai: Admin");
    }
}
