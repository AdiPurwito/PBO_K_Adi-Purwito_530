/**
 * Class KarakterGame adalah class dasar (parent/super class) untuk karakter dalam game.
 * Class ini menyimpan informasi dasar yang dimiliki oleh semua karakter seperti nama dan kesehatan.
 */
public class KarakterGame {
    // Deklarasi variabel instance (field) dengan access modifier private
    private String nama;     // Menyimpan nama karakter
    private int kesehatan;   // Menyimpan nilai kesehatan karakter

    /**
     * Constructor untuk membuat objek KarakterGame baru
     * @param nama      Nama karakter yang akan dibuat
     * @param kesehatan Nilai kesehatan awal karakter
     */
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;        // 'this' merujuk pada instance saat ini, menetapkan parameter nama ke field nama
        this.kesehatan = kesehatan;  // Menetapkan parameter kesehatan ke field kesehatan
    }

    /**
     * Method getter untuk mendapatkan nama karakter
     * @return String yang berisi nama karakter
     */
    public String getNama() {
        return nama; // Mengembalikan nilai field nama
    }

    /**
     * Method getter untuk mendapatkan nilai kesehatan karakter
     * @return int yang berisi nilai kesehatan karakter
     */
    public int getKesehatan() {
        return kesehatan; // Mengembalikan nilai field kesehatan
    }

    /**
     * Method setter untuk mengubah nilai kesehatan karakter
     * @param kesehatan Nilai kesehatan baru yang akan ditetapkan
     */
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan; // Menetapkan parameter kesehatan ke field kesehatan
    }

    /**
     * Method kosong untuk menyerang karakter lain
     * Method ini dideklarasikan tanpa implementasi (tubuh kosong) dan kemungkinan 
     * akan di-override oleh subclass
     * @param target KarakterGame yang menjadi target serangan
     */
    public void serang(KarakterGame target){
        // Implementasi kosong, kemungkinan akan di-override oleh subclass
    }
}