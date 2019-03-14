
class Point 
{
	int x,y;
	void setXY(int m,int n)
	{
		x = m;
		y = n;
	}
}
public class Example4_2
{
	public static void main (String [] args)
	{
		Point p1,p2;  // 声明对象p1 p2
		p1 = new Point(); // 为对象p1 分配变量
		p2 = new Point();
		/*一个类声明的两个对象如果具有相同的引用
		 * 那么二者就具有完全相同的实体
		 * Java有所谓的垃圾收集机制
		 * 这种机制周期性地检测某个实体是否已经不再被任何对象所拥有(引用)
		 * 若发现这样的实体，就释放这个实体占的内存
		 * */
		System.out.println("p1 的引用："+ p1);
		System.out.println("p2 的引用："+ p2);
		p1.setXY(1111, 2222);
		p2.setXY(-100, -200);
		System.out.println("p1 的x,y坐标："+p1.x+"," +p1.y);
		System.out.println("p2 的x,y坐标："+p2.x+"," +p2.y);
		p1 = p2; 
		/* 在系统看上去他们的名字是一个
		*/
		System.out.println("将p2的引用赋给p1后：");
		System.out.println("p1 的引用："+p1);
		System.out.println("p2 的引用："+p2);
		System.out.println("p1 的x,y坐标："+p1.x+"," +p1.y);
		System.out.println("p2 的x,y坐标："+p2.x+"," +p2.y);
	}
}
