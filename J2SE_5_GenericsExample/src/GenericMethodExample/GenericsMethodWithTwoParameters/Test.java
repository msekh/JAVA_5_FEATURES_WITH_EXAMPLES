package GenericMethodExample.GenericsMethodWithTwoParameters;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String args[]) {
		Integer[] intArr = { 2, 3, 4, 5,5,5, 6,5, 7 };
		Double[] doubleArr = { 23.0, 21.89, 7.8, 12.34 };
		Long[] longArr = { 10L, 20L, 30L, 40L };

		// For Integer Number
		MyGenericsClass<Number> mgc1 = new MyGenericsClass<>(intArr);
		Double averageOfInt = mgc1.getAverage();
		System.out.println(averageOfInt);

		// For Double Number
		MyGenericsClass<Number> mgc2 = new MyGenericsClass<>(doubleArr);
		Double averageOfDouble = mgc2.getAverage();
		System.out.println(averageOfDouble);

		// For Long Number
		MyGenericsClass<Number> mgc3 = new MyGenericsClass<>(longArr);
		Double averageOfLong = mgc3.getAverage();
		System.out.println(averageOfLong);
		
		System.out.println(getCount(intArr, 5));
	}
	
	private static <T extends Comparable<T>> int getCount(T[] arr, T elements){
	int count=0;
	for(T t:arr) {
		if(t.equals(elements)) {
			count++;
		}
	}
	return count;
	
	}

}
