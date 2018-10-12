package SuppressWarningAndDeprecated;

public class Addition {
@Deprecated	
public int sum(int n1, int n2) {
	return n1+n2;
}
	public int sum(int... nums) {
		int  sum=0;
		for(int i:nums) {
			sum=sum+i;
		}
		return sum;
	}	
}

