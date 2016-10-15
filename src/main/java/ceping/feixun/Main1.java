package ceping.feixun;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 显示指定年份中的每一天
 * Created by corly on 2016/10/15.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入年份");
        int year=scan.nextInt();
        int m=1;//月份计数
        while (m<13)
        {
            int month=m;
            Calendar cal=Calendar.getInstance();//获得当前日期对象
            cal.clear();//清除信息
            cal.set(Calendar.YEAR,year);
            cal.set(Calendar.MONTH,month-1);//1月从0开始
            int count=cal.getActualMaximum(Calendar.DAY_OF_MONTH) ;
            int week=cal.get(Calendar.DAY_OF_WEEK);
            System.out.printf("\t\t\t%d年%d月\n\n",year,month);
            System.out.print("日\t一\t二\t三\t四\t五\t六\n");
            int i,j;
            for (i=0;i<week-1 ;i++ )
            {
                System.out.print("\t");
            }
            for (j=1;j<=count ;j++ )
            {
                System.out.print(j+"\t");
                if ((i+j)%7==0)
                {
                    System.out.println();
                }
            }
            System.out.println();
            m++;
        }
    }
}
