package perpustakaan;

public interface Peminjaman {
    void pinjamBuku(String idAnggota, String judul);
    void kembalikanBuku(String idAnggota, String judul);
}