package 引用类型参数的传递_例4_7;

public class Example4_7 {
	public static void main(String[] args)
	{
		Battery nanfu = new Battery(100);
		System.out.println("南孚电池的储电量是："+ nanfu.electricityAmount);
		Radio radio = new Radio();
		System.out.println("收音机开始使用南孚电池");
		radio.openRadio(nanfu);
		System.out.println("目前电池容量为："+nanfu.electricityAmount);
		
	}
}
