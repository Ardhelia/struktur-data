//Latihan mandiri latihan 3 no.2
public class TransposeMatriks {
    public static void main(String[] args) {

        // Matriks A
        int[][] matriksA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Transpose Matriks
        int[][] transposeA = transposeMatriks(matriksA);

        // Tampilkan hasil
        System.out.println("Transpose Matriks A:");
        tampilkanMatriks(transposeA);
    }

    public static int[][] transposeMatriks(int[][] A) {
        int baris = A.length;
        int kolom = A[0].length;
        int[][] transpose = new int[kolom][baris];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;
    }

    public static void tampilkanMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int nilai : baris) {
                System.out.print(nilai + " ");
            }
            System.out.println();
        }
    }
}
