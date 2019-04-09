package 访问权限;

public class Jerry_Public {
	float g() {
		Tom_Public cat = new Tom_Public();
		cat.weight = 23f;
		return cat.f(3f, 4f);
	}
	public static void main(String[] args) {
		Jerry_Public jerry = new Jerry_Public();
		System.out.println(jerry.g());
	}
}
