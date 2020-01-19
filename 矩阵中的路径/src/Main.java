import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2020/1/19 8:46
 * Content: 搜索 DFS
 */

class Solution {
    private int row;
    private int col;
    private boolean[][] flag;
    public boolean hepl(char[][] map,String str,int x,int y){
        int[][] next = {{1,0},{-1,0},{0,1},{0,-1}};
        if (str.length() == 0){
            return true;
        }

        for (int k = 0; k < 4; k++) {
            int xx = x + next[k][0];
            int yy = y + next[k][1];
            if (xx >= row || xx < 0 || yy >= col || yy < 0){
                continue;
            }
            if (map[xx][yy] == str.charAt(0) && !flag[xx][yy]){
                flag[xx][yy] = true;
                boolean res  = hepl(map, str.substring(1), xx, yy);
                if (res){
                    return true;
                }
                flag[xx][yy] = false;
            }
        }
        return false;
    }
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if (str.length == 0 || matrix.length == 0){
            return false;
        }
        char[][] map = new char[rows][cols];
        row = rows;
        col = cols;
        int k = 0;
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            ss.append(str[i]);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                map[i][j] = matrix[k++];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (map[i][j] == str[0]){
                    flag = new boolean[rows][cols];
                    flag[i][j] = true;
                    if(hepl(map, ss.substring(1),i,j))
                        return true;
                }
            }
        }
        return false;
    }

//    ABCE
//    SFCS
//    ADEE
}
public class Main {
    public static void main(String[] args) {
        char[] a = {
                'A','B','C','E','S','F','C','S','A','D','E','E'
        };
        char[] b = {'S','E','E'};
        Solution solution = new Solution();
        boolean b1 = solution.hasPath(a, 3, 4, b);
        System.out.println(b1);
    }
}
