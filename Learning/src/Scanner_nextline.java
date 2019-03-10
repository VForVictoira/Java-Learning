import java.util.Scanner;

public class Scanner_nextline
{
	public static void main(String[] asgs) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("nextline方式接收：");
		if(scan.hasNextLine())
		{
			String str1 = scan.nextLine();
			System.out.println("输入数据为："+str1);
			
		}
	scan.close();
	}
}
