//Latihan mandiri latihan 3 no.2
public class TransposeMatriks {
    //kelas publik bernama TransposeMatriks
    public static void main(String[] args) {
        //metode utama di mana eksekusi program dimulai.

        // Matriks A
        int[][] matriksA = {
            //mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bilangan bulat bernama matriksA.
            {1, 2, 3},
            //mendefinisikan baris pertama dari matriksA dengan elemen 1, 2, dan 3.
            {4, 5, 6}
            //Baris ini mendefinisikan baris kedua dari matriksA dengan elemen 4, 5, dan 6.
        };

        // Transpose Matriks
        int[][] transposeA = transposeMatriks(matriksA);
        //memanggil metode transposeMatriks dengan argumen matriksA, dan menyimpan hasilnya dalam variabel transposeA.

        // Tampilkan hasil
        System.out.println("Transpose Matriks A:");
        //mencetak teks "Transpose Matriks A:" ke terminal.
        tampilkanMatriks(transposeA);
        //memanggil metode tampilkanMatriks dengan argumen transposeA untuk menampilkan hasil transpose matriks ke terminal.
    }

    public static int[][] transposeMatriks(int[][] A) {
        //mendefinisikan metode transposeMatriks yang menerima matriks sebagai argumen dan mengembalikan hasil transpose matriks.
        int baris = A.length;
        //menyimpan jumlah baris dari matriks A ke dalam variabel baris.
        int kolom = A[0].length;
        //menyimpan jumlah kolom dari matriks A ke dalam variabel kolom.  
        int[][] transpose = new int[kolom][baris];
        //mendeklarasikan dan menginisialisasi matriks transpose dengan ukuran kolom x baris untuk menyimpan hasil transpose.

        for (int i = 0; i < baris; i++) {
            // loop luar yang beriterasi melalui setiap baris dari matriks A.
            for (int j = 0; j < kolom; j++) {
                // loop dalam yang beriterasi melalui setiap kolom dari matriks A.
                transpose[j][i] = A[i][j];
                //mengisi elemen transpose[j][i] dengan nilai dari A[i][j], yang merupakan operasi transpose.
            }
        }
        return transpose;
        //mengembalikan matriks hasil transpose.
    }

    public static void tampilkanMatriks(int[][] matriks) {
        //mendefinisikan metode tampilkanMatriks yang menerima matriks sebagai argumen dan menampilkan elemen-elemen matriks ke terminal.
        for (int[] baris : matriks) {
            // loop for-each yang beriterasi melalui setiap baris dari matriks.
            for (int nilai : baris) {
                //loop for-each yang beriterasi melalui setiap elemen dalam baris.
                System.out.print(nilai + " ");
                //mencetak nilai elemen diikuti dengan spasi.
            }
            System.out.println();
            //mencetak baris baru setelah setiap baris matriks dicetak.
        }
    }
}
