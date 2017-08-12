package practice;

public class IntertionSort {
		public static void sort(int [] arr){
			for(int i = 1; i < arr.length; i++){
				int temp = arr[i];
				int pos = i;
				while(pos > 0 && temp < arr[pos-1]){
					arr[pos] = arr[pos-1];
					pos--;
					
				}
				arr[pos] = temp;
			}
		}
}
