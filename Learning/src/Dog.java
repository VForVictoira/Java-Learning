// 避免重载出现歧义
public class Dog {
	static void cry(double m,int n) {
		System.out.println("Puppy");
	}
	static void cry(int m,double n) {
		System.out.println("Small dog");
	}
}

/*
 * Dog.cry(10.0,10)
 * ---> Puppy
 * Dog.cry(10,10.0)
 * ---> Small dog
 * Dog.crg(10,10)
 * --->
 * 无法通过编译，因为Dog.cry(10,10)不清楚应当执行重载方法中的哪一个*/
