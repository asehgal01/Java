package practice;

public class DataSet {
	private int sum;
	private int numberOfValues;
	
	
	public DataSet() {
		sum = 0;
		numberOfValues = 0;
		
	}
	public DataSet(int value){
		sum = value;
		numberOfValues = 1;
	}
	public void addValue (int amount) {
		sum += amount;
		numberOfValues++;
	}
	
	public int getSum(){
		return sum;
	}
	public double getAverage(){
		return (double) sum/numberOfValues;
	}
	
}
