package 访问权限;

public class Student {
	private int age;
	public void setAge(int age) {
		if (age>=7 && age<=28)
			this.age = age;
	}// 通过setAge方法来控制对象对private 变量 age的操作
	public int getAge() {
		return age;
	}
}

