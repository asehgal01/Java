package practice;

import java.util.Arrays;

public class SelectionSort {
		public static void sort(int [] arr){
			for(int i = 0; i < arr.length-1;i++ ){
				int posOfMin = i;
				for(int k = i+1; k < arr.length; k++){
					if(arr[k] < arr[posOfMin])
						posOfMin = k;		
				}
				int temp = arr[i];
				arr[i]= arr[posOfMin];
				arr[posOfMin] = temp;
				
			}
		}
		public static void main(String [] args){
			int[] vals = {71, 86, 79, 36, 78, 35, 75, 86, 24, 11};
			sort(vals);
			System.out.println(Arrays.toString(vals));
		}
}

