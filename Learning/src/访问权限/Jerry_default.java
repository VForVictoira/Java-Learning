package 访问权限;

public class Jerry_default {
	void g() {
		Tom_default  cat = new Tom_default();
		cat.weight = 23f;
		float sum = cat.f(3f, 3f);
	}
}
