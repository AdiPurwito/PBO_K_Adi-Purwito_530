import java.time.LocalDateTime;                 // Mengimport API untuk waktu dan tanggal
import java.time.format.DateTimeFormatter;      // Mengimpooort API unutuk memformat waktu

// Kelas RekeningBank untuk merepresentasikan rekening bank
public class RekeningBank {
    // Atribut untuk menyimpan nomor rekening, nama pemilik, dan saldo rekening
    String nomorRekening;       // Nomor rek. Pengguna dengan string
    String namaPemilik;         // Nama pemiik dengan string
    double saldo;               // Saldo rekening menggunakan tipe double

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);     // Tampilan no. rekening
        System.out.println("Nama Pemilik: " + namaPemilik);         // Tampilan nama pemilik
        System.out.println("Saldo: Rp" + saldo);                    // Tampilan saldo
        System.out.println();
    }

    // Metode untuk mendapatkan waktu saat ini dengan format ( dd-MM-yyyy )
    private String getWaktuSekarang() {                 // Menggunakan private unutuk menjaga data waktu hanya bisa digunakan di RekeningBank
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");   // Menentukan format waktu
        return LocalDateTime.now().format(formatter);   // Mereturn waktu saat ini dalam format yang telah ditettukan
    }

    // Metode untuk melakukan transaksi setor uang
    public void setorUang(double jumlah) {
        saldo += jumlah;        // Menambahkan jumlah ke saldo
        // Menambahkan keterangan waktu sebelum nama pemilik dan jumlah setoran
        System.out.println("[" + getWaktuSekarang() + "] " + namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    // Metode untuk melakukan transaksi tarik uang
    public void tarikUang(double jumlah) {
        if (saldo < jumlah) {   // Mengecek apakah saldo cukup untuk penarikan
            System.out.println("[" + getWaktuSekarang() + "] " + namaPemilik + " menarik Rp" + jumlah + " (Gagal, saldo tidak mencukupi). Saldo saat ini: Rp" + saldo);
        } else {
            saldo -= jumlah;    // Mengurangi saldo jika cukup
            System.out.println("[" + getWaktuSekarang() + "] " + namaPemilik + " menarik Rp" + jumlah + " (Berhasil). Saldo sekarang: Rp" + saldo);
        }
        System.out.println();
    }
}