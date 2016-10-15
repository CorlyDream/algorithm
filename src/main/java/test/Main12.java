package test;

/**
 * Created by corly on 2016/9/23.
 */
public class Main12 {

    public static void main(String [] args) {
        boolean x=true;
        boolean y=false;
        short z=42;
        if((z++==42) &&(y=true))z++;
        if((x=false) ||(++z==45)) z++;
        System.out.println("z="+z);
    }
}
