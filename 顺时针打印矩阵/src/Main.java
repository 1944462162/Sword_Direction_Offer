/**
 * Author: wangJianBo
 * Date: 2019/12/9 9:29
 * Content:
 */

import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
     //   boolean[][] flag = new boolean[matrix.length+1][matrix[0].length+1];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        int[] nextI = {0,1,0,-1};
        int[] nextJ = {1,0,-1,0};
        int S = -1;
        int X = matrix.length;
        int Z = -1;
        int Y = matrix[0].length;
        int x,y;
        boolean F = true;
        while (true){
            if (k == 4){
                k = 0;
            }
            if (F){
                arrayList.add(matrix[i][j]);
            }
            F = true;
            if (arrayList.size() == matrix.length * matrix[0].length){
                break;
            }
             x = i + nextI[k];
             y = j + nextJ[k];
           if (y == Y){
               S++;
               k++;
               F = false;
               continue;
           }
           if (x == X){
               Y--;
               k++;
               F = false;
               continue;
           }
           if (y == Z){
               X--;
               k++;
               F = false;
               continue;
           }
           if (x == S){
               Z++;
               k++;
               F = false;
               continue;
           }

           i = x;
           j = y;
        }
        return arrayList;
    }
}

/**
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 *
 * 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Main {
    public static void main(String[] args) {
        int[][] a = {{1 ,2 ,3 ,4,5},
                { 6 ,7 ,8, 9,10},
                {11, 12,13,14 ,15,},
                { 16,17,18,19,20}};
        Solution solution = new Solution();
        ArrayList<Integer> arrayList = solution.printMatrix(a);
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
    }
}
