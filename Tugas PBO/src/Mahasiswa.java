import java.util.Scanner;

public class Mahasiswa extends User {
    private String pic;

    // Constructor menggunakan super untuk menginisialisasi nama dan nim
    public Mahasiswa(String nama, String nim, String pic) {
        super(nama, nim);
        this.pic = pic;
    }

    public Mahasiswa() {
        super("Adi Purwito", "202410370110530");
        this.pic = "0987654321";
    }

    // Getter and Setter for PIC
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    // Override methode login
    @Override
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username Mahasiswa: ");
        String inputUser = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String inputNim = scanner.nextLine();
        System.out.print("Masukkan PIC Anda: ");
        String inputPic = scanner.nextLine();

        return inputUser.equals(getNama()) && inputNim.equals(getNim()) && inputPic.equals(pic);
    }

    // Override method displayinfo
    @Override
    public void displayInfo() {
        System.out.println("=== Informasi Mahasiswa ===");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
        System.out.println("PIC: " + pic);
        System.out.println("Login sebagai: Mahasiswa");
    }
}
