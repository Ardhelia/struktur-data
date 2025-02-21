Latihan1
public class LatihanArray1 {
//kelas publik bernama LatihanArray1    
    public static void main(String[] args) {
       //metode utama di mana eksekusi program dimulai.
        int[] bilanganGenap = new int[10];
        // mendeklarasikan sebuah array bilangan bulat bernama bilanganGenap dengan 10 elemen.
        int jumlah = 0;
        //menginisialisasi variabel bernama jumlah untuk menyimpan jumlah semua elemen array.
        

        // Mengisi array
        for (int i = 0; i < bilanganGenap.length; i++) {
        //
            bilanganGenap[i] = (i + 1) * 2;
        }

        // Menampilkan array
        System.out.println("Isi array:");
        for (int bilangan : bilanganGenap) {
            System.out.print(bilangan + " ");
            jumlah += bilangan;
        }

        System.out.println("\\nJumlah semua elemen: " + jumlah);
    }
}
 
