import java.util.Scanner;

public class Scanner_hasnext {
	public static void main(String[] asgs) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("next方式接收：");
		if (scan.hasNext()) 
		{
			String str1 = scan.next();
			System.out.println("输入数据为："+ str1);
		}
		scan.close();
	}
}
