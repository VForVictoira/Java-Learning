package 手机与SIM卡的关系;

public class Example4_9
{
	public static void main(String[] args) {
		SIM simOne = new SIM(13889776509L);
		MobileTelephone mobile = new MobileTelephone();
		mobile.setSIM(simOne);
		System.out.println("手机号码："+mobile.lookNumber());
		SIM simTwo = new SIM(15375480618L);
		mobile.setSIM(simTwo); //更换 SIM卡
		System.out.println("手机号码："+mobile.lookNumber());
	}
}
