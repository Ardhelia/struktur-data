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
int[] kuantitasBeli = new int[100];
    Array kuantitasBeli untuk menyimpan jumlah pesanan setiap menu.
 System.out.println("=== Selamat Datang di Kafe ===");
 System.out.println();
 System.out.println("=== Menu ===");
    Mencetak pesan selamat datang dan judul menu.
 for (int i = 0; i < daftarMenu.length; i++) {  
        System.out.println((i + 1) + ". " + daftarMenu[i] + " - Rp" + hargaMenu[i]); 
 }
    Perulangan for untuk menampilkan daftar menu yang tersedia dan harga masing-masing menu.
System.out.println();
    Mencetak baris kosong setelah daftar menu.
 do {
    Memulai perulangan do-while yang akan menampilkan pilihan menu utama berulang kali.
System.out.println("=== Menu Utama ===");
System.out.println("1. Tambah Pesanan");
System.out.println("2. Tampilkan Data Pesanan");
System.out.println("3. Hitung Total Biaya");
System.out.println("4. Selesai");
 System.out.print("Pilihan menu: ");
 pilihan = input.nextInt();
 input.nextLine();
    Mencetak pilihan menu utama dan menerima input pilihan dari pengguna, menyimpannya dalam variabel pilihan.
switch (pilihan) {
    case 1:
     System.out.print("Pilih nomor menu pesanan: ");
     int pilihanMenu = input.nextInt();
     input.nextLine();
        Jika pengguna memilih menu 1 (Tambah Pesanan), program meminta pengguna untuk memilih nomor menu yang ingin dipesan.
     if (pilihanMenu < 1 || pilihanMenu > daftarMenu.length) {
        System.out.println("Nomor tidak valid");
        System.out.println();
        break;
        }
        Mengecek apakah nomor menu yang dipilih valid (antara 1 hingga panjang daftar menu).
     System.out.print("Masukkan jumlah pesanan: ");
     int kuantitas = input.nextInt();
        Program meminta pengguna untuk memasukkan jumlah pesanan.
    namaPesanan[total] = daftarMenu[pilihanMenu - 1];
    harga[total] = hargaMenu[pilihanMenu - 1];
    kuantitasBeli[total] = kuantitas;
    total++;
    System.out.println(kuantitas + " " + daftarMenu[pilihanMenu - 1] + " berhasil ditambahkan");
    System.out.println();
    break;
        Menu yang dipilih, harga, dan jumlah pesanan disimpan dalam array sesuai dengan indeks total. Setelah itu, total diincrement, dan pesan konfirmasi ditampilkan.
    case 2:
     int totalSementara = 0;
     System.out.println();
     System.out.println("=== Daftar pesanan ===");
       for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + ". " + " " + namaPesanan[i] + " x" + kuantitasBeli[i] + " - Rp." + (harga[i] * kuantitasBeli[i]));
            totalSementara += harga[i] * kuantitasBeli[i];
            }
           System.out.println("Total Biaya Sementara: Rp." + totalSementara);
           System.out.println();
           break;
        Menampilkan semua pesanan yang telah dilakukan, termasuk nama, kuantitas, dan harga total untuk setiap item. Kemudian, total biaya sementara dihitung dan ditampilkan.
    case 3:
      int totalBayar = 0;
        for (int i = 0; i < total; i++) {
            totalBayar += harga[i] * kuantitasBeli[i];
            }
            System.out.println("Total bayar: Rp." + totalBayar);
            System.out.println();
            break;
        Menghitung total biaya semua pesanan dan menampilkannya.
    case 4:
     System.out.println("Terima kasih telah memesan di kafe kami");
     break;
        Menampilkan pesan terima kasih dan keluar dari menu utama.
    default:
    System.out.println("Pilihan tidak valid. Silakan coba lagi");
    System.out.println();
        Menampilkan pesan jika pilihan yang dimasukkan tidak valid.
 } while (pilihan != 4);
    Program akan mengulang menu utama hingga pengguna memilih opsi 4 untuk keluar.
    }
}
    Menutup metode main dan kelas.










   

 




 


  


 