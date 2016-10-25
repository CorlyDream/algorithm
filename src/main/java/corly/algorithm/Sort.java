package corly.algorithm;

import java.util.Arrays;

public class Sort {
	public static int[] a ={2,1,4,9,3,5,7,6,8};
	
	public void bubblSort(){
		int i,j;
		for(i= a.length-1; i>=0; i-- ){
			for(j=0; j<i; j++){
				if (a[i]< a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}	
	
	public void quickSort(int start,int end){
		if (start>=end) {
			return;
		}
		int i = start,j=end;
		int tmp = a[i];
		while(i<j){
			while(i<j && a[j]>tmp){
				j--;
			}
			a[i++] = a[j];
			while(i<j && a[i]<tmp){
				i++;
			}
			a[j--] = a[i];
		}
		a[i] = tmp;
		quickSort(start, i-1);
		quickSort(i+1, end);
	}
	
	public void directInsert(){
		int i,j;
		for(i=1; i< a.length; i++){
			int tmp = a[i];
			for(j=i-1;j>=0; j--){
				if (tmp>= a[j]) {
					break;
				}else{
					a[j+1] = a[j];
				}
			}
			a[j+1] = tmp;
		}
	}
	
	public void insertHalf(){
		int i,j,mid;
		for(i=1; i< a.length; i++){
			int tmp = a[i];
			int start = 0,end=i-1;
			while(start<=end){
				mid = (start+end)/2;
				if (a[mid]>tmp) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
			for(j=i-1; j>=end+1; j--){
				a[j+1] = a[j];
			}
			a[end+1] = tmp;
		}
	}

	public void heapSort() {
		int i;
		for(i= a.length-1; i>0; i--) {
			buildHeap(i);
			a[0] = a[i];
			a[i] = a[1];
			a[1] = a[0];
		}
	}

	private void buildHeap(int size) {
		for(int i = size/2; i>0; i--) {
			adjust(i, size);
		}
	}

	private void adjust(int i, int size) {
		int tmp = a[i];
		i = i<<1;
		while (i <= size) {
			if (i+1<=size && a[i + 1] > a[i]) {
				i++;
			}
			if (tmp < a[i]) {
				a[i >> 1] = a[i];
			}else
				break;
			i = i << 1;
		}
		a[i>>1] = tmp;
	}
	
	public void print(){
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		Sort sort = new Sort();
//		sort.insertHalf();
		sort.heapSort();
		sort.print();
	}
}
