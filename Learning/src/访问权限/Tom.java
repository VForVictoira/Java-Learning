package 访问权限;

public class Tom {
	private float weight; // weight是private的float型变量
	private float f(float a,float b) { // f是private非法
		return a+b;
	}
}
/*
 * private 修饰的只能在本类内使用*/
 */