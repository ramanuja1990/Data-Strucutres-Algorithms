import java.util.Scanner;
import java.io.IOException;

class MatrixRotate {

    public static boolean rotateMatrix(int[][] matrix){
        if(matrix[0].length != matrix.length){
            return false;
        }
        int n = matrix.length;
        for(int layer = 0; layer < n / 2; layer++){
            int last = n - 1 - layer;
            for(int i = layer; i <  n - 1 - layer; i++){
                int top = matrix[i][layer];
                matrix[i][layer] = matrix[last][i];
                matrix[last][i] = matrix[last - i + layer][last];
                matrix[last - i + layer][last] = matrix[layer][last - i + layer];
                matrix[layer][last - i + layer] = top;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner bi = new Scanner(System.in);
        System.out.println("Enter Matrix Length");
        int n = bi.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter Matrix");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = bi.nextInt();
            }
        }
        System.out.println("MATRIX PRINT");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        rotateMatrix(matrix);
        System.out.println("MATRIX PRINT");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}