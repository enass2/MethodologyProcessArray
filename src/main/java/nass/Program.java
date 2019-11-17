package nass;
import static org.junit.Assert.*;



public class Program {

	public  int getMaxVal(int[] array) {
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];

		}
		return max;
	}

	public  int getMinVal(int[] array) {
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		return min;
	}

	public  double getAverage(int[] array) {
		int total = 0;
		double average;
		
		for (int i = 0; i < array.length; i++) {
			total += array[i];

		}
		
		average = (double)total/array.length;
		
		
		return Math.round(average * 100.0) / 100.0;
	
		

	}
	public int getSum(int [] array) {
		int sum =0;
		for(int i =0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

}

