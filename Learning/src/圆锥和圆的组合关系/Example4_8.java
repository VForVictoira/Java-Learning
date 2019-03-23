package 圆锥和圆的组合关系;

public class Example4_8
{
	public static void main(String[] args)
	{
		Circle circle = new Circle(); // 创建 Circle 对象 circle
		circle.setRadius(10);  // 调用Circle 方法 setRadius 取得半径
		Circular circular = new Circular();  // 创建 Circular 对象 circular
		System.out.println("circle的引用："+circle);
		System.out.println("圆锥的bottom的引用："+circular.bottom);
		circular.setHeight(5); // 调用 Circular 方法 setHeight 取得圆锥高
		circular.setBottom(circle);
		System.out.println("circle的引用："+circle);
		System.out.println("圆锥的bottom的引用："+circular.bottom);
		System.out.println("圆锥的体积："+circular.getVolme());
		System.out.println("修改circle的半径，bottom的半径同样变化");
        circle.setRadius(2);
		System.out.println("bottom的半径："+circular.getBottomRadius());
		System.out.println("重新创建circle，circle的引用将发生变化");
		circle = new Circle();
		System.out.println("circle的引用："+circle);
		System.out.println("但是不影响circular的bottom的引用：");
		System.out.println("圆锥的bottom的引用："+circular.bottom);
	}
}
