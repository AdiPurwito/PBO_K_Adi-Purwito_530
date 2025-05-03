package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buku
        NonFiksi nonFiksi = new NonFiksi("Dari Penjara Ke Penjara", "Tan Malaka", "Pengetahuan Sosial");
        Fiksi fiksi = new Fiksi("1984", "George Orwell", "Fiksi Distopia");

        // Membuat objek anggota
        Anggota anggota1 = new Anggota("Adi Purwito", "K530");
        Anggota anggota2 = new Anggota("Ayub Kuyub", "K512");

        // Menampilkan info buku
        nonFiksi.displayInfo();
        fiksi.displayInfo();

        System.out.println();

        // Simulasi peminjaman
        System.out.println("Anggota: " + anggota1.nama + " (ID: " + anggota1.idAnggota + ")");
        anggota1.pinjamBuku(anggota1.idAnggota, "1984");

        System.out.println("Anggota: " + anggota2.nama + " (ID: " + anggota2.idAnggota + ")");
        anggota2.pinjamBuku("Dari Penjara Ke Penjara", 7);

        System.out.println();

        // Simulasi pengembalian
        anggota1.kembalikanBuku(anggota1.idAnggota, "1984");
        anggota2.kembalikanBuku(anggota2.idAnggota, "Dari Penjara Ke Penjara");
    }
}