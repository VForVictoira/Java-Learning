public class Employee2
{
	private static double salary;
	// salary 是静态私有变量
	public static final String DEPARTMENT = "开发人员";
	// DEPARTMENT 是一个常量
	public static void main(String[] args)
	{
		salary = 10000;
		System.out.println(DEPARTMENT+ "平均工资:"+salary);
	}
}