package ceping.shengda;

import java.util.Scanner;

/**
<<<<<<< HEAD
 * Created by corly on 2016/9/21.
 */
public class Main3 {
    public static final int N = 99999;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        boolean[] notPrime = new boolean[N];
        int i,j;
        for(i=2; i<N; i++) {
            if (!notPrime[i]) {
                for(j=i; j*i < N && j*i>1; j++) {
                    notPrime[j*i] = true;
                }
            }
        }
        int count = 0;
        i=1;
        while (++i < N) {
            if (!notPrime[i])
                count++;
            if (count == k)
                break;
        }
        System.out.println(i);
=======
 * Created by corly on 2016/9/28.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cost = 0;
        while (in.hasNextDouble()) {
            double time = in.nextDouble();
            if (time<3.0){
                System.out.println(5.00);
            }else {
                cost = 5+(time-3.0)*2.0;
                cost = cost>50?50.00:cost;
                System.out.println( String.format("%.2f", cost));
            }
        }

>>>>>>> 951833c98ff59861945b3969495d928e6d595de6
    }
}
