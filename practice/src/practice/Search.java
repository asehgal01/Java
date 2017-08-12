package practice;

public class Search {
	
	public static int search(int [] arr, int key){
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == key)
				return i;
			
		}
		return -1;
	}
	
	public static int binarySearch(int [] arr, int key){
		int low = 0;
		int high = arr.length-1;
		while (low <= high){
			int midpoint = (high+low)/2;
			if(key < arr[midpoint])
				high = midpoint-1;
			else if(key == arr[midpoint])
				return midpoint;
			else
				low = midpoint + 1;
			
		}
		return -1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
