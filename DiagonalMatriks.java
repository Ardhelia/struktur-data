//Latihan Mandiri latihan 3
public class DiagonalMatriks {
//kelas publik bernama DiagonalMatriks
    public static void main(String[] args) {
        //metode utama di mana eksekusi program dimulai.
        
        // Matriks A
        int[][] matriksA = {
            //mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bilangan bulat bernama matriksA.
            {1, 2, 3},
            //mendefinisikan baris pertama dari matriksA dengan elemen 1, 2, dan 3.
            {4, 5, 6},
            // mendefinisikan baris kedua dari matriksA dengan elemen 4, 5, dan 6.
            {7, 8, 9}
            //mendefinisikan baris ketiga dari matriksA dengan elemen 7, 8, dan 9.
        };

        // Menampilkan Diagonal Utama
        System.out.println("Diagonal Utama Matriks A:");
        //mencetak teks "Diagonal Utama Matriks A:" ke terminal.
        tampilkanDiagonalUtama(matriksA);
        //memanggil metode tampilkanDiagonalUtama dengan argumen matriksA untuk menampilkan diagonal utama matriks ke terminal.

        // Menampilkan Diagonal Samping
        System.out.println("\nDiagonal Samping Matriks A:");
        //mencetak baris baru (\n) dan teks "Diagonal Samping Matriks A:" ke terminal.
        tampilkanDiagonalSamping(matriksA);
        // memanggil metode tampilkanDiagonalSamping dengan argumen matriksA untuk menampilkan diagonal samping matriks ke terminal.
    }

    public static void tampilkanDiagonalUtama(int[][] A) {
        //mendefinisikan metode tampilkanDiagonalUtama yang menerima matriks sebagai argumen dan menampilkan diagonal utama matriks.
        for (int i = 0; i < A.length; i++) {
            //loop for yang beriterasi melalui setiap baris dari matriks A.
            System.out.print(A[i][i] + " ");
            //mencetak elemen A[i][i], yang merupakan elemen diagonal utama, diikuti dengan spasi.
        }
        System.out.println();
        //mencetak baris baru setelah diagonal utama dicetak.
    }

    public static void tampilkanDiagonalSamping(int[][] A) {
        //mendefinisikan metode tampilkanDiagonalSamping yang menerima matriks sebagai argumen dan menampilkan diagonal samping matriks.
        int n = A.length;
        //menyimpan jumlah baris (atau kolom, karena matriks persegi) dari matriks A ke dalam variabel n.
        for (int i = 0; i < n; i++) {
            //loop for yang beriterasi melalui setiap baris dari matriks A.
            System.out.print(A[i][n - i - 1] + " ");
            //mencetak elemen A[i][n - i - 1], yang merupakan elemen diagonal samping, diikuti dengan spasi.
        }
        System.out.println();
        //mencetak baris baru setelah diagonal samping dicetak.
    }
}
