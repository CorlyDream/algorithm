package ceping.shengda;

import java.util.Scanner;

/**
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

    }
}
