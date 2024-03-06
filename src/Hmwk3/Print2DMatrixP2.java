package Hmwk3;

import java.util.Arrays;

public class Print2DMatrixP2 {

    public static void main(String[] args) {
        
        int[][] matrix = new int[4][3];

        int filler;
        int row = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                filler = row + j+1;
                System.out.print(filler+ ",");
                if (j == matrix[i].length -1){
                    System.out.println();
                    row = filler;
                }
            }
        }
     }
}
