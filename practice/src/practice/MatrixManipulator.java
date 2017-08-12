package practice;
/**
 * Offers the specified operations on integer matrices.
 */
public class MatrixManipulator
{
	/**
	 * Determines if (first + second) is defined where + indicates matrix addition.
	 * 
	 * @return true if matrix addition is defined, false otherwise.
	 */
	public static boolean addable(int[][] first, int[][] second)
	{
		return true; // remove this
	}

	/**
	 * Performs (first + second) where + indicates matrix addition. (Precondition: addable(first, second) returns true.)
	 * 
	 * @return the result of first + second.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] add(int[][] first, int[][] second)
	{
		int [][] sum = new int [first.length][first[0].length];
		 
        for (int i = 0; i < first.length; i++)
        {
            for (int j = 0; j < first[0].length; j++)
            {
                sum[i][j] = first[i][j] + second[i][j];
                 
               
            }
             
            System.out.println();
        }
		return sum;
    }

	/**
	 * Performs (scalar * matrix) where * indicates scalar multiplication of a matrix. (Precondition: matrix.length > 0 && matrix[0].length > 0)
	 * 
	 * @return the result of scalar * matrix.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] multiplyByScalar(int scalar, int[][] matrix)
	{
		int [][] scalarX = new int [matrix.length][matrix[0].length];
		
		 
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                scalarX[i][j] = (scalar) * matrix[i][j];
                 
               
            }
             
            System.out.println();
        }
		return scalarX;
	}

	/**
	 * Multiplies the specified row of first and the specified column of second. (Precondition: first[row].length > 0 && first[row].length == second.length)
	 * 
	 * @return the result of multipliying the specified row and column.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int multiply(int[][] first, int row, int[][] second, int col)
	{
		return 0; // remove this
	}

	/**
	 * Determines if (first * second) is defined where * indicates matrix multiplication.
	 * 
	 * @return true if matrix multiplication is defined, false otherwise.
	 */
	public static boolean multipliable(int[][] first, int[][] second)
	{
		
		if (!(first.length == second[0].length && first[0].length == second.length))
				return false;
	}

	/**
	 * Performs (first * second) where * indicates matrix multiplication. (Precondition: multipliable(first, second) returns true.)
	 * 
	 * @return the result of first * second.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] multiply(int[][] first, int[][] second)
	{
		int[][] C= new int[2][5];
	    int i,j;

	    ////I fill the matrix with zeroes, if I don't do this it gives me an error
	    for(i=0;i<2;i++) {
	        for(j=0;j<2;j++){
	            C[i][j]=0;
	        }
	    }
	    for(i=0;i<2;i++){
	        for(j=0;j<2;j++)
	            C[i][j]+=(first[i][j]*second[j][i]);
	    }
	    return C;
	}

	private static boolean atLeastOneByOne(int[][] matrix)
	{
		return matrix != null && matrix.length > 0 && matrix[0].length > 0;
	}
}
