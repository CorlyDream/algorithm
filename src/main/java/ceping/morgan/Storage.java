package ceping.morgan;

/**
 * Created by corly on 2016/10/30.
 */
public class Storage {
    int data1;
    float data2;
    Storage(int data1, float data2) {
        this.data1 = data1;
        this.data2 = data2;
    }
    void modify(int value) {
        this.data1 = this.data1 / value;
        this.data2 = this.data2 / value;
        value = value + 2;
    }
}
