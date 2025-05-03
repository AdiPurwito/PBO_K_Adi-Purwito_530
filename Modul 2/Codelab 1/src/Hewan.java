public class Hewan {                // Kelas Hewan

    // Atribut untuk informasi hewan
    String nama;                    // Atribut nama
    String jenis;                   // Atribut jenis hewan
    String suara;                   // Atribut suara hewan
    boolean jinak;                  // Menjunnjukan hewan jinak atau liar dengan boolean
    String makanan;                 //  Atribut makanan hewan

    // Metode untuk menampilkan informasi hewan dengan tampilkanInfo dan diikuti System.out.println
    void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println("Status: " + (jinak ? "Jinak" : "Liar"));        // Untuk mendefinisikan kategoti hewan jinak atau liar
        System.out.println("Makanan: " + makanan);
        System.out.println();                                               // Baris kososng unutuk pemisah output
    }
}