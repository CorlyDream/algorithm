package test;


public class Z extends X{
    Y y=new Y();
    public Z(){
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Z();
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
