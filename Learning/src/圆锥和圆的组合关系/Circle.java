package 圆锥和圆的组合关系;

public class Circle 
{
	double radius,area;  // 定义成员变量 radius area
	void setRadius(double r) {
		radius = r;
	}
	double getRadius() {
		return radius;
	}
	double getArea() {
		area = 3.14*radius*radius; // 返回圆的面积
		return area;
	}
}
