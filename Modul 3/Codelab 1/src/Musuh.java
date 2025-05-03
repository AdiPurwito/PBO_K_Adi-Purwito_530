/**
 * Class Musuh merupakan turunan (subclass) dari KarakterGame.
 * Class ini memiliki mekanisme fase dimana musuh bisa berubah menjadi fase kedua yang lebih kuat
 * ketika kesehatannya berkurang hingga setengah dari kesehatan maksimal.
 */
public class Musuh extends KarakterGame {
    // Deklarasi variabel instance tambahan khusus untuk Musuh
    private int fase;                  // Menyimpan fase musuh saat ini (1 atau 2)
    private boolean transisiDilakukan; // Status apakah transisi fase sudah dilakukan
    private int kesehatanMaksimal;     // Menyimpan nilai kesehatan maksimal musuh

    /**
     * Constructor untuk membuat objek Musuh baru
     * @param nama      Nama musuh
     * @param kesehatan Nilai kesehatan awal musuh
     */
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);         // Memanggil constructor dari superclass (KarakterGame)
        this.fase = 1;                  // Secara default, musuh berada pada fase 1
        this.transisiDilakukan = false; // Secara default, transisi belum dilakukan
        this.kesehatanMaksimal = kesehatan; // Menyimpan kesehatan awal sebagai kesehatan maksimal
    }

    /**
     * Getter untuk mendapatkan nilai kesehatan maksimal musuh
     * @return int yang berisi nilai kesehatan maksimal
     */
    public int getKesehatanMaksimal() {
        return kesehatanMaksimal; // Mengembalikan nilai kesehatanMaksimal
    }

    /**
     * Method untuk memeriksa apakah kondisi untuk transisi ke fase kedua terpenuhi
     * dan mengaktifkan fase kedua jika kondisi terpenuhi.
     * Transisi terjadi ketika HP <= 50% dari HP maksimal, fase masih 1, dan belum pernah transisi.
     */
    public void cekDanAktifkanFaseKedua() {
        // Memeriksa apakah kondisi untuk transisi terpenuhi
        if (getKesehatan() <= getKesehatanMaksimal() * 0.5 && fase == 1 && !transisiDilakukan) {
            fase = 2;                  // Mengubah fase menjadi 2
            transisiDilakukan = true;  // Menandai bahwa transisi sudah dilakukan

            // Menampilkan pesan transformasi ke fase kedua
            System.out.println("==========================================");
            System.out.println(getNama() + " berubah menjadi fase kedua: " + getNama() + ", Goddess of Rot!");
            System.out.println("Serangan baru terbuka dan kekuatan meningkat!");
            System.out.println("==========================================");
            System.out.println();
        }
    }

    /**
     * Method untuk menyerang karakter lain.
     * Override method serang dari superclass (KarakterGame).
     * Sebelum menyerang, method ini akan memeriksa apakah musuh perlu bertransisi ke fase kedua.
     * @param target KarakterGame yang menjadi target serangan
     */
    @Override
    public void serang(KarakterGame target) {
        // Memeriksa dan mengaktifkan fase kedua jika kondisi terpenuhi
        cekDanAktifkanFaseKedua();

        // Nilai dasar untuk damage dan jenis serangan (fase 1)
        int damage = 15;
        String jenisSerangan = "normal";

        // Jika musuh sudah dalam fase 2, pilih serangan yang lebih kuat
        if (fase == 2) {
            // Memilih serangan secara acak dari 3 kemungkinan (0, 1, atau 2)
            int pilihSerangan = (int)(Math.random() * 3);

            // Menentukan damage dan jenis serangan berdasarkan pilihan acak
            switch(pilihSerangan) {
                case 0:
                    damage = 40;                // Damage untuk Scarlet Aeonia
                    jenisSerangan = "Scarlet Aeonia";
                    break;
                case 1:
                    damage = 35;                // Damage untuk Butterfly Wing Slash
                    jenisSerangan = "Butterfly Wing Slash";
                    break;
                case 2:
                    damage = 50;                // Damage untuk Rot Explosion
                    jenisSerangan = "Rot Explosion";
                    break;
            }
        }

        // Mengurangi kesehatan target berdasarkan damage yang dihitung
        target.setKesehatan(target.getKesehatan() - damage);
        // Menampilkan informasi serangan yang digunakan
        System.out.println(getNama() + " menggunakan serangan " + jenisSerangan + "!");
        // Menampilkan informasi damage yang diterima target dan HP tersisa
        System.out.println(target.getNama() + " menerima " + damage + " damage. HP Tersisa: " + target.getKesehatan());
    }


}