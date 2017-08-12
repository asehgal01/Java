package practice;

public class DataSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSet test1 = new DataSet();
		DataSet test2 = new DataSet(7);
		test1.addValue(19);
		test1.addValue(14);
		
		test2.addValue(16);
		test2.addValue(12);
		
		System.out.println(test1.getSum());
		System.out.println(test2.getSum());
		System.out.println(test1.getAverage());
		System.out.println(test2.getAverage());
	
	}

}
