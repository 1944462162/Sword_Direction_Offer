/**
 * Author: wangJianBo
 * Date: 2020/1/18 9:50
 * Content: 查找重复
 */

 class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers[i] == numbers[j]){
                    duplication[0] = numbers[i];
                    return true;
                }
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {2,3,1,0,2,5,3};
        Solution solution = new Solution();
        boolean duplicate = solution.duplicate(a, a.length, new int[1]);
        System.out.println(duplicate);
    }
}
