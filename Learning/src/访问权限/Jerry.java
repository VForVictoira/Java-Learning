package 访问权限;

public class Jerry {
	void g() {
		Tom cat = new Tom();
		cat.weight = 23f;  // 非法，因为weight是private变量
		float sum = cat.f(3.4); // 非法，因为f是private方法
	}
}
