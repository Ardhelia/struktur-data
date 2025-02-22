//Latihan 2
public class PencarianArray {
//kelas publik bernama PencarianArray
    public static void main(String[] args) {
    //metode utama di mana eksekusi program dimulai.

        // Program mencari nilai dalam array
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
        //mendeklarasikan dan menginisialisasi sebuah array bilangan bulat bernama nilai dengan 8 elemen.
        int cari = 90;
        //mendeklarasikan variabel cari bertipe integer dan menginisialisasinya dengan 90.
        boolean ketemu = false;
        //mendeklarasikan variabel ketemu bertipe boolean dan menginisialisasinya dengan false. 
        int indeks = -1;
        // mendeklarasikan variabel indeks bertipe integer dan menginisialisasinya dengan -1. Variabel ini menyimpan indeks dari nilai yang dicari jika ditemukan. Nilai -1 digunakan sebagai nilai awal untuk menunjukkan bahwa nilai belum ditemukan.

        // Mencari nilai
        for (int i = 0; i < nilai.length; i++) {
            //memulai loop for yang akan iterasi melalui setiap elemen dalam array nilai.
            if (nilai[i] == cari) {
                //memeriksa apakah elemen array saat ini (nilai[i]) sama dengan nilai yang dicari (cari).
                ketemu = true;
                //Jika nilai ditemukan, baris ini mengubah nilai variabel ketemu menjadi true.
                indeks = i;
                //menyimpan indeks elemen yang ditemukan ke dalam variabel indeks.
                break;
                //aris ini menghentikan loop for menggunakan break,Karena sudah menemukan nilai yang dicari.
            }
        }

        // Menampilkan hasil
        if (ketemu) {
        //memeriksa apakah nilai yang dicari ditemukan (ketemu bernilai true).
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
            //Jika nilai ditemukan, baris ini mencetak pesan yang menunjukkan nilai yang dicari dan indeksnya.
        } else {
            //Jika nilai tidak ditemukan (ketemu bernilai false).
            System.out.println("Nilai " + cari + " tidak ditemukan");
            //Jika nilai tidak ditemukan, baris ini mencetak pesan yang menunjukkan bahwa nilai tidak ditemukan.
        }
    }
}
