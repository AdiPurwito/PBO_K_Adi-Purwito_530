public class Main{          // Kelas main unutuk menjalankan program

    public static void main(String[]args){

        // Membuat objek baru(new) hewan 1, hewan 2 dan hewan 3
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();
        Hewan hewan3 = new Hewan();

        // Mengisi nama-nama hewan pada ojek baru
        hewan1.nama = "Kucing";
        hewan2.nama = "Anjing";
        hewan3.nama = "Buaya";

        // Mengisi jenis hewan (Mamalia, amfibi, reptil)
        hewan1.jenis = "Mamalia";
        hewan2.jenis = "Mamalia";
        hewan3.jenis = "Reptil";

        // Mengisi suara khas hewan
        hewan1.suara = "Nyann~~";
        hewan2.suara = "Woof-Woof!!";
        hewan3.suara = "Growlll";

        // Menentukan kategori hewan jinak atau tidak (Jinak : True  ; Liar : False)
        hewan1.jinak = true;
        hewan2.jinak = true;
        hewan3.jinak = false;

        // Mengisi makanan yang dikonsumsi hewan
        hewan1.makanan = "Ikan";
        hewan2.makanan = "Daging";
        hewan3.makanan = "Daging";

        // Memanggil metode tampilkanInfo() unutk menampilkan informasi hewan
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
        hewan3.tampilkanInfo();
    }
}
