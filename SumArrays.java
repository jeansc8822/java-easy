import java.io.*;

public class SumArrays {
	
	public static int SumArrays(int[][] inputArray) {
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j <inputArray[i].length; j++) {
				sum += inputArray[i][j];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[][] test = {{1, 1, 1, 100}, {100, 0, 0}, {0, 0, 0, 0}};
		System.out.println(test[0][0]);
		//prints # of rows
		System.out.println(test.length);
		//prints # of columns
		System.out.println(test[0].length);
		System.out.println(SumArrays(test));
	}
}
