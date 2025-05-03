package perpustakaan;

public class Anggota implements Peminjaman {
    public String nama;
    public String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    @Override
    public void pinjamBuku(String idAnggota, String judul) {
        System.out.println(nama + " meminjam buku berjudul: " + judul);
    }

    @Override
    public void kembalikanBuku(String idAnggota, String judul) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judul);
    }

    public void pinjamBuku(String judul, int durasi) {
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasi + " hari.");
    }
}