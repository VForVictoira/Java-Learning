package 接口回调;
interface ShowMessage{
	void 显示商标(String s);
}

class TV implements ShowMessage{
	public void 显示商标(String s) {
		System.out.println(s);
	}
}

class PC implements ShowMessage{
	public void 显示商标(String s) {
		System.out.println(s);
	}
}
public class Example6_2 {
	public static void main(String[] args) {
		ShowMessage sm = new TV();
		sm.显示商标("长城牌电视机"); // 接口回调
		sm = new PC();
		sm.显示商标("神州笔记本"); // 接口回调
	}
}
