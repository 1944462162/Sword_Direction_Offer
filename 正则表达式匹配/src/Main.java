/**
 * Author: wangJianBo
 * Date: 2020/1/19 10:53
 * Content:
 */
class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        int x = 0;
        int y = 0;
        while (x < str.length && y < pattern.length){
            if (pattern[y] == '.'){
                if (y + 1 < pattern.length && pattern[y + 1] == '*'){
                    if (x + 1 < str.length && str[x] == str[x + 1]){
                        x++;
                    }
                    else{
                        y += 2;
                    }
                    continue;
                }
                else{
                    x++;
                    y++;
                    continue;
                }
            }
            if (y + 1 < pattern.length && pattern[y + 1] == '*'){
                if (str[x] == pattern[y]){
                    x++;
                }
                else{
                    y += 2;
                }
                continue;
            }
            if (str[x] == pattern[y]){
                x++;
                y++;
                continue;
            }
            break;
        }
        int i;
        for (i = y; i < pattern.length - 1; i++) {
            if (pattern[i + 1] == '*'){
                i += 1;
                continue;
            }
            if (pattern[i] == '.'){
                i++;
            }
        }
        y = i;
        if (y < pattern.length && pattern[y] == '*'){
            y++;
        }
        return x == str.length && y == pattern.length;
    }
}
public class Main {
    public static void main(String[] args) {
        char[] a = {'a'};
        char[] c = {'.','*'};
        Solution solution = new Solution();
        boolean match = solution.match(a, c);
        System.out.println(match);
    }
}
