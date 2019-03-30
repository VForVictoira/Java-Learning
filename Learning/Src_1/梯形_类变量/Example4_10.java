package 梯形_类变量;
public class Example4_10
{
	public static void main(String[] args) {
		Lader.下底 = 100;
		// Lader字节码被加载到内存，通过类名直接操作类变量
		Lader laderOne = new Lader();
		Lader laderTwo = new Lader();
		laderOne.设置上底(28);
		laderTwo.设置上底(66);
		System.out.println("laderOne的上底："+laderOne.获取上底());
		System.out.println("laderOne的下底："+laderOne.获取下底());
		System.out.println("laderTwo的上底："+laderTwo.获取上底());
		System.out.println("laderTwo的下底："+laderTwo.获取下底());
		
	}
}
/*运行结果：
 * laderOne的上底：28.0
   laderOne的下底：100.0
   laderTwo的上底：66.0
   laderTwo的下底：100.0*/
