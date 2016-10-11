package test.excercize;

import java.util.Arrays;

/**
 * Created by corly on 2016/10/10.
 */
public class Sort {

    public static void insertSort(int[] a) {
        int i, j;
        for(i=1; i<a.length; i++) {
            int tmp = a[i];
            j = i - 1;
            while (j>=0 && tmp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j+1] = tmp;
        }
    }

    public static void insertSort1(int[] a) {
        int i,j;
        for(i=1; i<a.length; i++) {
            int s = 0, e = i - 1;
            while (s <= e) {
                int mid = (s+e)/2;
                if (a[i] >= a[mid]) {
                    s = mid + 1;
                }else
                    e = mid - 1;
            }
            int tmp = a[i];
            for(j=i-1; j>=s; j--) {
                a[j + 1] = a[j];
            }
            a[s] = tmp;
        }
    }

    public static void quickSort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start, j = end;
        int tmp=a[i];
        while (i < j) {
            while (i < j && tmp <= a[j]) {
                j--;
            }
            a[i] = a[j];
            while (i < j && tmp > a[i]) {
                i++;
            }
            a[j] = a[i];
        }
        a[i] = tmp;
        quickSort(a, start, i - 1);
        quickSort(a, i+1, end);
    }

    public static void main(String[] args) {
        int a[] = {2, 3, 5, 1, 7, 4, 9, 8, 6};
//        quickSort(a, 0, a.length-1);
        insertSort1(a);
        System.out.println(Arrays.toString(a));
    }
}
