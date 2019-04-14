package 子类的继承性;

public class Example5_1 {
	public static void main(String args[]) {
		Student zhang = new Student();
		zhang.age = 17;
		zhang.number = 199112;
		zhang.showPeopleMess();
		zhang.tellNumber();
		int x=9,y=29;
		System.out.print("会做加法\n");
		int result = zhang.add(x, y);
		System.out.printf("%d+%d=%d\n",x,y,result);
		UniverStudent geng = new UniverStudent();
		geng.age = 18;
		geng.number = 102123;
		geng.showPeopleMess();
		geng.tellNumber();
		System.out.println("会做加法");
		result = geng.add(x, y);
		System.out.printf("%d+%d=%d\n",x,y,result);
		System.out.println("会做乘法");
		result = geng.multi(x, y);
		System.out.printf("%d*%d=%d\n",x,y,result);
		
	}
}
