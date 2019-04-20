package 实现接口;

public class China implements Computable {
	int number;
	public int f(int x) {
		int sum = 0;
		for(int i = 0;i<=x;i++)
			sum+=i;
		return sum;
	}

}
