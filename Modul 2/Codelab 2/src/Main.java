// Kelas Main untuk menjalankan program utama
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek RekeningBank baru
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        // Mengisi informasi rekening secara manual
        rekening1.nomorRekening = "202410370110530";        // Atribut nomor rekening 1
        rekening1.namaPemilik = "Adi Purwito";              // Atribut nama pemilik 1
        rekening1.saldo = 500000.0;                         // Atribut Saldo awal pemilik 1

        rekening2.nomorRekening = "202410370110513";        // Atribut nomor rekening 2
        rekening2.namaPemilik = "Muhammad Rifky";           // Atribut nama pemilik 2
        rekening2.saldo = 700000.0;                         // Atribut saldo awal pemilik 2

        // Menampilkan informasi rekening sebelum transaksi
        System.out.println("Informasi rekening sebelum transaksi:");
        rekening1.tampilkanInfo();      // Menampilkan info rekening 1
        rekening2.tampilkanInfo();      // Menampilkan info rekening 2

        // Melakukan transaksi setor tunia
        System.out.println("Transaksi setor uang:");
        rekening1.setorUang(200000.0);  // Rekening 1 menyetor Rp200.000
        rekening2.setorUang(500000.0);  // Rekening 2 menyetor Rp500.000

        // Melakukan transaksi tarik tunai
        System.out.println("Transaksi tarik uang:");
        rekening1.tarikUang(800000.0); // Rekening 1 mencoba menarik Rp800.000 (bisa gagal jika saldo tidak cukup)
        rekening2.tarikUang(300000.0); // Rekening 2 menarik Rp300.000

        // Menampilkan informasi rekening setelah transaksi
        System.out.println("Informasi rekening setelah transaksi:");
        rekening1.tampilkanInfo();      // Menampilkan info rekening 1 setelah penarikan
        rekening2.tampilkanInfo();      // Menampilkan info rekening 2 setelah penarikan
    }
}
