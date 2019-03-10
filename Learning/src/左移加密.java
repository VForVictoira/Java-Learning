
public class 左移加密 
{
	public static void main(String[] args) 
	{
		char a = '9';
		System.out.println("左移加密后：");
		a = (char)(a<<1);
		System.out.println("密文："+ a);
		a = (char)(a>>1);
		System.out.println("原文："+a);
	}
}
