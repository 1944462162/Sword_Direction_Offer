/**
 * Author: wangJianBo
 * Date: 2019/12/8 11:08
 * Content:
 */

class Solution {
    public int RectCover(int target) {
        if (target == 0){
            return 0;
        }
        return hepl(target,0);
    }
    private int hepl(int target, int S){
        if (target == 0 && S % 2 == 0){
            return 1;
        }
        if (target < 0){
            return 0;
        }
        return hepl(target -1 ,S ) + hepl(target - 2, S+2);
    }

}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.RectCover(6));
    }
}
