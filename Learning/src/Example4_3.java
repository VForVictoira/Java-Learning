
class XIyoujiRenwu 
{
	float height,weight;
	String head,ear;
	void speak(String s)
	{
		head = "歪着头";
		System.out.println(s);
	}
}
public class Example4_3
{
	public static void main(String[] args)
	{
		XIyoujiRenwu zhubajie,sunwukong; // 声明对象 
		zhubajie = new XIyoujiRenwu (); // 为对象分配变量
		sunwukong = new XIyoujiRenwu();
		zhubajie.height = 1.80f;
		zhubajie.head = "大头";
		zhubajie.ear = "一对大耳朵";
		sunwukong.height = 1.62f;
		sunwukong.weight = 1000f;
		sunwukong.head = "秀发";
		System.out.println("猪八戒身高："+ zhubajie.height);
		System.out.println("猪八戒的头："+ zhubajie.head);
		zhubajie.speak("我是猪");
		
	}
}
