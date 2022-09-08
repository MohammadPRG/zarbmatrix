import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row1, row2, col1, col2;
        System.out.print("Enter row of first matrix :  ");
        row1 = scanner.nextInt();
        System.out.print("Enter column of first matrix :  ");
        col1 = scanner.nextInt();
        System.out.print("Enter row of second matrix :  ");
        row2 = scanner.nextInt();
        System.out.print("Enter column of second matrix :  ");
        col2 = scanner.nextInt();
        System.out.println();

        int[][] mat1 = new int[row1][col1];
        int[][] mat2 = new int[row2][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("Enter number first matrix(" + (i + 1) + " " + (j + 1) + ") :  ");
                mat1[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("Enter number second matrix (" + (i + 1) + " " + (j + 1) + ") :  ");
                mat2[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        printMatrix(row1, col1, mat1);
        printMatrix(row2, col2, mat2);

        int[][] matmulti = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    matmulti[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        printMatrix(row1, col2, matmulti);
    }

    static void printMatrix(int row, int col, int[][] mat) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");
    }
}