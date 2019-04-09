package 访问权限;

public class Example4_19 {
	public static void main(String[] args) {
		Student zhang = new Student();
		Student geng = new Student();
		zhang.setAge(23); //使用setAge()来操作private 变量 age
		System.out.println("zhang的年龄是："+zhang.getAge());
		geng.setAge(25);
		System.out.println("geng的年龄是："+geng.getAge());
	}
}
