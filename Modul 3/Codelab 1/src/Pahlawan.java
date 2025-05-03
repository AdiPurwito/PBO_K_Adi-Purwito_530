/**
 * Class Pahlawan merupakan turunan (subclass) dari KarakterGame.
 * Class ini menambahkan kemampuan khusus berupa Holy Arcane yang dapat meningkatkan damage serangan.
 */
public class Pahlawan extends KarakterGame {
    // Deklarasi variabel instance tambahan khusus untuk Pahlawan
    private boolean holyArcaneAktif;  // Status apakah Holy Arcane sedang aktif atau tidak

    /**
     * Constructor untuk membuat objek Pahlawan baru
     * @param nama      Nama pahlawan
     * @param kesehatan Nilai kesehatan awal pahlawan
     */
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);  // Memanggil constructor dari superclass (KarakterGame)
        this.holyArcaneAktif = false;  // Secara default, Holy Arcane tidak aktif
    }

    /**
     * Method untuk mengaktifkan kemampuan Holy Arcane.
     * Holy Arcane mengurangi HP Pahlawan sebesar 20% tetapi meningkatkan damage.
     * @return boolean - true jika berhasil diaktifkan, false jika gagal (HP ≤ 0)
     */
    public boolean aktifkanHolyArcane() {
        // Menghitung pengurangan HP sebesar 20% dari HP saat ini
        int penguranganHP = (int) (getKesehatan() * 0.20);
        // Mengurangi HP pahlawan dengan nilai yang dihitung
        setKesehatan(getKesehatan() - penguranganHP);

        // Memeriksa apakah HP sudah habis setelah pengurangan
        if (getKesehatan() <= 0) {
            // Jika HP ≤ 0, pahlawan mati karena penggunaan Holy Arcane
            System.out.println(getNama() + " mati karena HP mencapai 0 akibat Holy Arcane!");
            return false;  // Mengembalikan false karena gagal mengaktifkan (pahlawan mati)
        }

        // Jika HP masih di atas 0, Holy Arcane berhasil diaktifkan
        holyArcaneAktif = true;  // Mengubah status holyArcaneAktif menjadi true
        // Menampilkan pesan berhasil mengaktifkan Holy Arcane
        System.out.println(getNama() + " mengaktifkan Holy Arcane! Damage meningkat 70%, HP berkurang " + penguranganHP + "! HP sekarang: " + getKesehatan());
        return true;  // Mengembalikan true karena berhasil mengaktifkan
    }

    /**
     * Method untuk menyerang karakter lain.
     * Override method serang dari superclass (KarakterGame).
     * @parameter target KarakterGame yang menjadi target serangan
     */
    @Override
    public void serang(KarakterGame target) {
        // Memilih serangan secara acak dari 3 kemungkinan (0, 1, atau 2)
        int pilihSerangan = (int)(Math.random() * 3);
        int damage = 0;  // Variabel untuk menyimpan nilai damage
        String jenisSerangan = "";  // Variabel untuk menyimpan nama serangan

        // Menentukan damage dan jenis serangan berdasarkan pilihan acak
        switch(pilihSerangan) {
            case 0:
                damage = 20;  // Damage untuk Tarnished Slash
                jenisSerangan = "Tarnished Slash";
                break;
            case 1:
                damage = 30;  // Damage untuk Elden Strike
                jenisSerangan = "Elden Strike";
                break;
            case 2:
                damage = 40;  // Damage untuk Godslayer Thrust
                jenisSerangan = "Godslayer Thrust";
                break;
        }

        // Meningkatkan damage sebesar 70% jika Holy Arcane aktif
        if (holyArcaneAktif) {
            damage = (int)(damage * 1.7);  // Meningkatkan damage sebesar 70%
        }

        // Menampilkan pesan serangan
        System.out.println(getNama() + " menyerang " + target.getNama() + " dengan " + jenisSerangan + "!");

        // Mengurangi kesehatan target berdasarkan damage yang dihitung
        target.setKesehatan(target.getKesehatan() - damage);
        // Menampilkan informasi damage yang diterima target dan HP tersisa
        System.out.println(target.getNama() + " menerima " + damage + " damage. HP Tersisa: " + target.getKesehatan());
    }
}