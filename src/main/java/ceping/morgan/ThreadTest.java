package ceping.morgan;

/**
 * Created by corly on 2016/10/30.
 */
public class ThreadTest extends Thread{
    public static void main(String argv[]){
        ThreadTest test = new ThreadTest ();
        test.run();
    }
    public void start(){
        for (int i = 0; i <10; i++)
            System.out.println(i);
    }
}
