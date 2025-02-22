//Latihan 3
public class StatistikArray {
    //kelas publik bernama StatistikArray
    public static void main(String[] args) {
        //metode utama di mana eksekusi program dimulai.
        
        // Program menghitung statistik nilai siswa
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
        //mendeklarasikan dan menginisialisasi sebuah array bilangan bulat bernama nilai dengan 8 elemen. 

        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        //mendeklarasikan variabel tertinggi bertipe integer dan menginisialisasinya dengan elemen pertama dari array nilai.
        int terendah = nilai[0];
        //mendeklarasikan variabel terendah bertipe integer dan menginisialisasinya dengan elemen pertama dari array nilai
        int total = nilai[0];
        //mendeklarasikan variabel total bertipe integer dan menginisialisasinya dengan elemen pertama dari array nilai.

        for (int i = 1; i < nilai.length; i++) {
            //memulai loop for yang akan iterasi melalui elemen-elemen array nilai, dimulai dari indeks 1.
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            //memeriksa apakah elemen array saat ini (nilai[i]) lebih besar dari nilai tertinggi. Jika ya, maka tertinggi diperbarui dengan nilai nilai[i].
            if (nilai[i] < terendah) terendah = nilai[i];
            //baris ini memeriksa apakah elemen array saat ini (nilai[i]) lebih kecil dari nilai terendah. Jika ya, maka terendah diperbarui dengan nilai nilai[i].
            total += nilai[i];
            //menambahkan nilai pada indeks i ke dalam total.
        }

        double rataRata = (double) total / nilai.length;
        //Baris ini menghitung rata-rata nilai dengan membagi total dengan jumlah elemen dalam array nilai

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Rata-rata: " + rataRata);
        //Baris-baris tersebut mencetak nilai tertinggi, nilai terendah, dan rata-rata ke terminal.
    }
}
