//Latihan1
public class Tugas1_P2  {
//kelas publik bernama Tugas1_P2 
    public static void main(String[] args) {
       //metode utama di mana eksekusi program dimulai.
        int[] bilanganGenap = new int[10];
        // mendeklarasikan sebuah array bilangan bulat bernama bilanganGenap dengan 10 elemen.
        int jumlah = 0;
        //menginisialisasi variabel bernama jumlah untuk menyimpan jumlah semua elemen array.
        

        // Mengisi array
        for (int i = 0; i < bilanganGenap.length; i++) {
        //loop for mengisi array dengan bilangan genap mulai dari 2. 
            bilanganGenap[i] = (i + 1) * 2;
        //baris ini mengisi setiap elemen array bilanganGenap dengan bilangan genap.   
        }

        // Menampilkan array
        System.out.println("Isi array:");
        //Baris ini mencetak teks "Isi array:" 
        for (int bilangan : bilanganGenap) {
        //loop foreach yang mengiterasi setiap elemen dari array.  
            System.out.print(bilangan + " ");
        //mencetak setiap elemen array diikuti dengan spasi.  
            jumlah += bilangan;
        //baris ini menambahkan nilai setiap elemen array ke variabel jumlah. 
        }

        System.out.println("\\nJumlah semua elemen: " + jumlah);
        //Baris ini mencetak baris baru (\n) dan teks "Jumlah semua elemen: " diikuti dengan nilai variabel jumlah.
    }
}
 
