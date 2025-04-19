public class User {
    private String nama;
    private String nim;

    // Constructor
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Get & Set method
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // method login akan di override superclass
    public boolean login() {
        return false;
    }

    // method displayinfo akan di override superclass
    public void displayInfo() {
        System.out.println("Informasi User");
    }
}