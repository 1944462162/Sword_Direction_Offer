/**
 * Author: wangJianBo
 * Date: 2020/1/19 9:53
 * Content:
 */
public class Solution {
    private int m;
    private int n;
    public int hepl(int k, int x, int y){

    }
    public int movingCount(int threshold, int rows, int cols)
    {
        m = rows;
        n = cols;
        return hepl(threshold,rows,cols);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.movingCount(13,4,4);
    }
}
