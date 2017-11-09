package ceping.oracle;

/**
 * Created by corly on 2016/11/3.
 */
public class Car extends Vehicle{
    public Car() {
        System.out.println("car");
    }

    static int x = 0;
    int y = ++x;
    static int z = x++;
    public static void main(String[] args) {
        new Car();
        int x= 1;
        int y = ++x;
        System.out.println(y);
    }

    Wheels wheels = new Wheels();
}
