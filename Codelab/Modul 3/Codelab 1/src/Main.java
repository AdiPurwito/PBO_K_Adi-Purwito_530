/**
 * Class Main adalah class utama yang berisi metode main untuk menjalankan program.
 * Class ini mensimulasikan pertarungan antara Pahlawan dan Musuh.
 */
public class Main {
    /**
     * Metode main adalah entry point program Java.
     * @param args array String yang dapat menerima argumen dari command line
     */
    public static void main (String[] args) {
        // Inisialisasi objek Pahlawan dengan nama "Tarnished" dan kesehatan 250
        Pahlawan pahlawan = new Pahlawan("Tarnished", 250);
        // Inisialisasi objek Musuh dengan nama "Malenia" dan kesehatan 200
        Musuh musuh = new Musuh("Malenia", 200);

        // Mencetak status awal dari Pahlawan dan Musuh
        System.out.println("=== Status Awal ===");
        // Memanggil getter getNama() dan getKesehatan() dari objek pahlawan untuk menampilkan informasi
        System.out.println(pahlawan.getNama() + " memiliki " + pahlawan.getKesehatan() + " HP.");
        // Memanggil getter getNama() dan getKesehatan() dari objek musuh untuk menampilkan informasi
        System.out.println(musuh.getNama() + " memiliki " + musuh.getKesehatan() + " HP.");
        System.out.println();

        // Mencetak pesan bahwa pertarungan dimulai
        System.out.println("=== Pertarungan Dimulai ===");
        System.out.println();

        // Loop while yang berjalan selama kesehatan pahlawan dan musuh di atas 0
        while (pahlawan.getKesehatan() > 0 && musuh.getKesehatan() > 0) {
            // Giliran Pahlawan

            // Memanggil metode aktifkanHolyArcane() dan keluar dari loop jika hasilnya false
            if (!pahlawan.aktifkanHolyArcane()) {
                break; // Keluar dari loop jika pahlawan tidak dapat mengaktifkan HolyArcane
            }
            // Memanggil metode serang() pada objek pahlawan dengan parameter objek musuh
            pahlawan.serang(musuh);
            System.out.println();

            // Memeriksa apakah musuh sudah mati (kesehatan <= 0)
            if (musuh.getKesehatan() <= 0) {
                // Mencetak pesan kematian musuh
                System.out.println(musuh.getNama() + " DEATH !");
                break; // Keluar dari loop karena musuh telah mati
            }

            // Giliran Musuh
            // Memanggil metode serang() pada objek musuh dengan parameter objek pahlawan
            musuh.serang(pahlawan);
            System.out.println();

            // Memeriksa apakah pahlawan sudah mati (kesehatan <= 0)
            if (pahlawan.getKesehatan() <= 0) {
                // Mencetak pesan kematian pahlawan
                System.out.println(pahlawan.getNama() + " DEATH !");
                break; // Keluar dari loop karena pahlawan telah mati
            }
        }

        // Mencetak pesan bahwa pertarungan telah selesai
        System.out.println("=== Pertarungan Selesai ===");
    }
}