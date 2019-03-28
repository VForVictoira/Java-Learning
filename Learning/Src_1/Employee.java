public class Employee{
	public String name;
	// name实例变量对子类可见
	private double salary;
	// salary 私有变量，仅在此类可见
	public Employee(String empName) {
		name = empName;
	}// 构造方法 Employee对name赋值
	public void setSalary(double empSal) {
		salary = empSal;
	}// setSalary方法对salary赋值
	public void printEmp() {
		System.out.println("名字："+name);
		System.out.println("薪水："+salary);
	}// printEmp方法输出
	public static void main(String[] args)
	{
		Employee empOne = new Employee("RUNOOB");
		empOne.setSalary(1000);
		empOne.printEmp();
	}
}
