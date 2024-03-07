package Hmwk3;

public class DiagonalSum {

    public static void main(String[] args) {


        int[][] martix = {{1, 2, 3, 0},
                          {4, 5, 6, 0},
                          {7, 8, 9, 0},
                          {10, 11, 12,10}};

        int sum = 0;
        int row = 0;
        int column = 0;
        for (int i = 0; i <martix.length ; i++) {
            for (int j = 0; j <martix[i].length ; j++) {
                if (row >= martix.length || column >= martix[i].length){
                    break;
                }
                int current = martix[row][column];
                sum +=current;
                row++;
                column++;
            }
        }

        System.out.println(sum);

    }
}
