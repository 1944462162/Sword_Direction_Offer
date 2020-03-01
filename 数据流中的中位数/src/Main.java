import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Author: wangJianBo
 * Date: 2020/3/1 16:54
 * Content: 查找
 */

class Solution {

    private ArrayList<Integer> arrayList = new ArrayList<>();
    public void Insert(Integer num) {
        arrayList.add(num);
    }

    public Double GetMedian() {
        Collections.sort(arrayList);
        if (arrayList.size() % 2 == 0){
            return (double) ((arrayList.get(arrayList.size() / 2) + arrayList.get(arrayList.size() / 2 - 1)) / 2.0);
        }
        else {
            return Double.valueOf(arrayList.get(arrayList.size() / 2));
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            solution.Insert(scanner.nextInt());
        }
        System.out.println(solution.GetMedian());
    }
}
