import java.util.Scanner; 
    mengimpor kelas Scanner, yang digunakan untuk menerima input dari pengguna.
public class uasSem1 {
    mendeklarasikan kelas publik bernama uasSem1.
public static void main(String[] args) {
   mendeklarasikan metode utama (main), yang merupakan titik awal eksekusi program.
Scanner input = new Scanner(System.in);
    Membuat objek Scanner bernama input untuk membaca input dari pengguna input standar (keyboard).
String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
    Mendeklarasikan array daftarMenu untuk menyimpan nama-nama item menu yang tersedia.
int[] hargaMenu = {20000, 15000, 12000, 10000, 8000, 20000, 25000};
    Mendeklarasikan array hargaMenu untuk menyimpan harga masing-masing item menu dalam daftarMenu.
int total = 0; 
    variabel total untuk menghitung jumlah pesanan yang telah dimasukkan.
int pilihan; 
   Variabel pilihan  untuk menyimpan pilihan menu utama yang dipilih oleh pengguna.
String[] namaPesanan = new String[100];
    array namaPesanan untuk menyimpan nama menu yang telah dipesan.
int[] harga = new int[100];
    Array harga untuk menyimpan harga dari menu yang dipesan.




 


  


 