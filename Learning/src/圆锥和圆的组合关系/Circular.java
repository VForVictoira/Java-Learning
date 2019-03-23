package 圆锥和圆的组合关系;

public class Circular
{
	Circle bottom;   // 使用Circle类创建成员变量 bottom 
	double height;
	void setBottom(Circle c) {//设置底为一个Circle对象
		bottom = c;
	}
	void setHeight(double h) {
		height = h;
	}
	double getVolme() {  // 计算圆锥体积1/3sh
		if(bottom == null)
			return -1;
		else
			return bottom.getArea()*height/3.0;
	}
	double getBottomRadius() {
		return bottom.getRadius(); // 设置圆锥底面半径
	}
	public void setBottomRadius(double r) { // 设置获取圆坠底面半径方法
		bottom.setRadius(r);
	}
}
