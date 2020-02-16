/**
 * Author: wangJianBo
 * Date: 2020/2/16 17:35
 * Content: 构建Hash表查找
 */

class Solution {
    //Insert one char from stringstream

    private StringBuilder stringBuilder = new StringBuilder();
    private int[] hashTable = new int[256];
    public void Insert(char ch)
    {
        stringBuilder.append(ch);
        hashTable[ch]++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (hashTable[stringBuilder.charAt(i)] == 1){
                return stringBuilder.charAt(i);
            }
        }
        return '#';
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.Insert('a');
        System.out.println(solution.FirstAppearingOnce());
    }
}
