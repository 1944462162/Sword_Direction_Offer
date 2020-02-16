import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: wangJianBo
 * Date: 2020/2/16 11:14
 * Content: 字符串模拟
 */
class Solution {
    public boolean isContinuous(int [] numbers) {
        if (numbers.length == 0){
            return false;
        }
        Arrays.sort(numbers);
        int count  = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == 0){
                count++;
            }
        }
        if (count == numbers.length){
            return true;
        }
        int tmp = 0;
        for (int j = numbers[count]; j <= numbers[numbers.length - 1]; j++) {
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[k] == j){
                    tmp++;
                    break;
                }
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0){
                set.add(numbers[i]);
            }
        }
        if (numbers.length - count != set.size()){
            return false;
        }
        Arrays.sort(numbers);
        if (count >= (numbers[numbers.length-1] - numbers[count] + 1) - tmp){
            return true;
        }
        else {
            return false;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean continuous = solution.isContinuous(new int[]{1,0,0,0});
        System.out.println(continuous);
    }
}
