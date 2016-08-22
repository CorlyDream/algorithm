package test;

import java.util.Arrays;

public class Sort {
	public static int[] arr={2,1,4,9,3,5,7,6,8};
	
	public void bubblSort(){
		int i,j;
		for(i=arr.length-1; i>=0; i-- ){
			for(j=0; j<i; j++){
				if (arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}	
	
	public void quickSort(int start,int end){
		if (start>=end) {
			return;
		}
		int i = start,j=end;
		int tmp = arr[i];
		while(i<j){
			while(i<j && arr[j]>tmp){
				j--;
			}
			arr[i++] = arr[j];
			while(i<j && arr[i]<tmp){
				i++;
			}
			arr[j--] = arr[i];
		}
		arr[i] = tmp;
		quickSort(start, i-1);
		quickSort(i+1, end);
	}
	
	public void directInsert(){
		int i,j;
		for(i=1; i<arr.length; i++){
			int tmp = arr[i];
			for(j=i-1;j>=0; j--){
				if (tmp>=arr[j]) {
					break;
				}else{
					arr[j+1] = arr[j];
				}
			}
			arr[j+1] = tmp;
		}
	}
	
	public void insertHalf(){
		int i,j,mid;
		for(i=1; i<arr.length; i++){
			int tmp = arr[i];
			int start = 0,end=i-1;
			while(start<=end){
				mid = (start+end)/2;
				if (arr[mid]>tmp) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
			for(j=i-1; j>=end+1; j--){
				arr[j+1] = arr[j];
			}
			arr[end+1] = tmp;
		}
	}
	
	public void print(){
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Sort sort = new Sort();
		sort.insertHalf();
		sort.print();
	}
}
