/**
 * Author: wangJianBo
 * Date: 2020/2/18 12:39
 * Content:
 */


class Solution {
    public boolean isNumeric(char[] str) {
        if (str.length == 0){
            return false;
        }
        if (str[0] != '+' && str[0] != '-' && (str[0] >'9' || str[0] < '0')){
            return false;
        }
        boolean flag = true;
        boolean ef = true;
        boolean Ef = true;
        if (str.length > 1){
            for (int i = 1; i < str.length; i++) {
                if ((str[i] >'9' || str[i] < '0') && str[i] != '.' && str[i] != 'e' && str[i] != 'E' && str[i] != '-' && str[i] != '+'){
                    return false;
                }
                if (str[i] == '-' && i == str.length - 1){
                    return false;
                }
                if (str[i] == '.' && flag){
                    flag = false;
                }
                else if (str[i] == '.' && (!flag || i == str.length - 1)){
                    return false;
                }
                if (str[i] == 'e' && ef && (i == str.length - 1 || (str[i + 1] != '-' || str[i + 1] != '+' || (str[i+1] >'9' || str[i+1] < '0'))) ){
                    ef = false;
                }
                else if (str[i] == 'e' && !ef){
                    return false;
                }
                if (str[i] == 'E' && Ef && (i == str.length - 1 && (str[i + 1] != '-' || str[i + 1] != '+' || (str[i+1] >'9' || str[i+1] < '0')))){
                    Ef = false;
                }
                else if (str[i] == 'E' && !Ef){
                    return false;
                }
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean numeric = solution.isNumeric(new char[]{'1','2','3','e','+','1','.','4'});
        System.out.println(numeric);
    }
}
