package GenericMethodExample.GenericsMethodWithTwoParameters;

public class MyGenericsClass<T extends Number> {
	private T []numArr;

	public MyGenericsClass(T[] numArr) {
		this.numArr = numArr;
	}
	
	public double getAverage() {
		double sum=0.0;
		for(int i=0; i<numArr.length; i++) {
			sum+=numArr[i].doubleValue();
		}
		double average = sum/numArr.length;
		return average;
	}

}
