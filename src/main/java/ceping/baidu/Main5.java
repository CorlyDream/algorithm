package ceping.baidu;

import java.util.Scanner;

/**
 * Created by corly on 2017/4/27.
 * <p>
 * 题目描述
 * 度度熊最近对全排列特别感兴趣,对于1到n的一个排列,度度熊发现可以在中间根据大小关系插入合适的大于和小于符号(即 '>' 和 '<' )
 * 使其成为一个合法的不等式数列。但是现在度度熊手中只有k个小于符号即('<')和n-k-1个大于符号(即'>'),
 * 度度熊想知道对于1至n任意的排列中有多少个排列可以使用这些符号使其为合法的不等式数列。
 * 例如n = 3, k = 1:
 * 1到3的排列中,可以插入1个小于符号和1个大于符号形成的不等式数列有:
 * 1<3>2  2<3>1  2>1<3  3>1<2
 * 即132 231 213 312 这4种排列是可以成为合法的不等式数列,所以答案是4。
 * <p>
 * 输入描述:
 * 输入包括一行,包含两个整数n和k(k < n ≤ 1000)
 * <p>
 * <p>
 * 输出描述:
 * 输出满足条件的排列数,答案对2017取模。
 * <p>
 * 输入例子:
 * 5 2
 * <p>
 * 输出例子:
 * 66
 */
public class Main5 {
    public static int count = 0;
    public static int count2 = 0;

    public static void permutation(int list[], int k) {
        if (list == null)
            return;
        else
            permutation(list, 0, list.length - 1, k);
    }

    private static void permutation(int[] list1, int start, int end, int k) {
        if (start == end) {
            int times = 0;
            int times2 = list1.length - 1;
            for (int i = 0; i < list1.length - 1; i++) {
                if (list1[i] < list1[i + 1]) {
                    times++;
                    times2--;
                    if (times > k || times2 < list1.length - 1 - k)
                        break;
                }
            }
            if (times == k)
                count++;
        } else {
            for (int i = start; i <= end; ++i) {
                if (isSwap(list1, start, i)) {
                    Swap(list1, start, i);
                    permutation(list1, start + 1, end, k);
                    Swap(list1, start, i);
                }
            }
        }
    }

    public static void Swap(int list1[], int i, int j) {
        int temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }

    private static boolean isSwap(int[] list1, int start, int i) {
        for (int k = start; k < i; k++)
            if (list1[k] == list1[i])
                return false;
        return true;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = i + 1;
        permutation(list, k);
        System.out.println(count % 2017);

    }
}