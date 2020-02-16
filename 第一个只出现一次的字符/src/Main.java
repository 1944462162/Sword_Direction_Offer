import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Author: wangJianBo
 * Date: 2020/2/15 21:10
 * Content: 查找
 */

class Solution {
    public int FirstNotRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.keySet().contains(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
            }
            else {
                map.put(str.charAt(i),1);
            }
        }

        char c = 0;
        for (Character integer : map.keySet()) {
//            System.out.println(integer);
            if (map.get(integer) == 1){
                c = integer;
                break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int aaAbCCCdFFF = solution.FirstNotRepeatingChar("AAAbCCCdFFF");
        System.out.println(aaAbCCCdFFF);
    }
}
