package 引用类型参数的传递_例4_7;

public class Radio 
{
	void openRadio(Battery battery)
	{
		battery.electricityAmount = battery.electricityAmount - 10;
		// 消耗了电量
	}
}
