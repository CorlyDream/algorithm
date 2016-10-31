package ceping.morgan;

/**
 * Created by corly on 2016/10/30.
 */
public class Main2 {

    public static void main(String[] args) {
        int x=5, y=0;
        try{
            try {
                System.out.println(x);
                System.out.println(x/y);
                System.out.println(y);
            }
            catch(ArithmeticException ex){
                System.out.println("Inner Catch1");
                throw ex;
            }
            catch(RuntimeException ex){
                System.out.println("Inner Catch2");
                throw ex;
            }
            finally {
                System.out.println("Inner Finally");
            }
        }
        catch (Exception ex) {
            System.out.println("Outer Catch");
        }
    }
}
