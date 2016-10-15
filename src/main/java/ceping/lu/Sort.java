package ceping.lu;

/**
 * Created by corly on 2016/10/11.
 */
public class Sort {
    //保存排序的结果
    private int[] recType = null;

    public Sort(int[] arr) {
        recType = arr;
    }

    ////////////////////////插入排序 start/////////////////////////////
    //插入排序
    public void insertSort(int n) {
        int i,j;
        int tmp;
        for(i=1; i<n; i++) {
            tmp = recType[i];
            j = i - 1;
            while(j >= 0 && tmp < recType[j]) {
                recType[j+1] = recType[j];
                j--;
            }
            recType[j+1] = tmp;
        }
    }
    //二分插入排序
    public void insertSort1(int n) {
        int i,j,low,high,mid;
        int tmp;
        for(i=1; i<n; i++){
            tmp = recType[i];
            low = 0;
            high = i - 1;
            while(low <= high){
                mid = (low + high)/2;
                if(tmp < recType[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            for(j=i-1; j>high+1; j--){
                recType[j+1] = recType[j];
            }
            recType[high+1] = tmp;
        }
    }
}
