package test;

/**
 * Created by corly on 2016/9/24.
 */
public class TestTemplate<K> {
    private K k;
    public void print() {
        System.out.println(k);
    }
    public void setK(K k){
        this.k = k;
    }
}
