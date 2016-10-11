package ceping.lu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by corly on 2016/10/10.
 */
public class Prime {
    /**
     * 筛选法判断素数
     * @param end 以内所有素数
     * @return 返回end以内的所有素数
     */
    public static List<Integer> getPrime(int end) {
        int[] isPrime = new int[end + 1];
        int i,j;
        // 默认所有的都是素数
        for(i=2; i<=end; i++) {
            isPrime[i] = 1;
        }
//        进行筛选
        for(i=2; i<Math.sqrt(end); i++) {
            if (isPrime[i]==1) {
                for(j=i; j*i<=end; j++) {
                    isPrime[i*j] = 0;
                }
            }
        }
        List<Integer> prime = new ArrayList<>();
        for(i=2; i<=end; i++) {
            if (isPrime[i] == 1) {
                prime.add(i);
            }
        }
        return prime;
    }


}
