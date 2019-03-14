package Example_Lader;
public class Lader   //创建 Lader 类
{
	double above;   // 变量声明
	/* 还可以写成：float above,bottom,height,area;*/
	double bottom;
	double height;
	double computeArea() // 定义计算梯形面积方法
	{
		return (double)(above+bottom)*height/2;
	}
}
