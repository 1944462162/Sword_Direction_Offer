/**
 * Author: wangJianBo
 * Date: 2020/2/15 17:37
 * Content: 字符串 + 自定义排序
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

 class Solution {
    public String PrintMinNumber(int [] numbers) {
        Comparator comparator = new MyComparator();
        Integer[] a = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            a[i] = numbers[i];
        }

        Arrays.sort(a,comparator);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            stringBuilder.append(a[i]);
        }
        return stringBuilder.toString();
    }

    class MyComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            String a1 = String.valueOf(o1);
            String a2 = String.valueOf(o2);
            return (a1 + a2).compareTo(a2 + a1);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.PrintMinNumber(new int[]{});
        System.out.println(s);
    }
}
