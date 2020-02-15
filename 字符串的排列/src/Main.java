/**
 * Author: wangJianBo
 * Date: 2020/2/15 16:27
 * Content: 全排列
 */

import java.util.*;

class Solution {
    private ArrayList<String> arrayList = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        if (str.equals("")){
            return arrayList;
        }
        help(str.toCharArray(),0,str.length());
        Set<String> set = new HashSet<>(arrayList);
        ArrayList<String> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);
        return arrayList;
    }
    private void help(char[] str, int start, int end) {

        if (start == end){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < str.length; i++) {
                stringBuilder.append(str[i]);
            }
            arrayList.add(stringBuilder.toString());
        }
        else{
            for (int i = start; i < end; i++) {
                swap(str,start, i);
                help(str, start + 1, end);
                swap(str,start, i);
            }
        }
    }

    public static void swap(char[] str, int i, int j){
        char tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<String> abc = solution.Permutation("aab");
        for (String s : abc) {
            System.out.println(s);
        }
    }
}
