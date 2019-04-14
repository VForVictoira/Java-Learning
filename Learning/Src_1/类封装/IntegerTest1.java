package 类封装;
public class IntegerTest1{ 
	 public static void main(String[] args){  
	  //int-->Integer
	  //基本数据类型-->引用类型
	  Integer i1 = new Integer(10);  
	  //Integer-->int
	  //引用类型-->基本类型
	  int i2 = i1.intValue(); 
	  System.out.println(i2 + 1); //11  
	  //重要：static int parseInt(String s);
	  //String-->int
	  int age = Integer.parseInt("25");
	  System.out.println(age+1); //26  
	  //"abc"这个字符串必须是“数字字符串”才行.
	  //int price = Integer.parseInt("abc"); //NumberFormatException
	  //重要：static double parseDouble(String s);
	  double price = Double.parseDouble("3.0");
	  System.out.println(price+1.0); //4.0 
	  //将int类型的十进制转换成2进制
	  String s1 = Integer.toBinaryString(10);
	  System.out.println(s1); //1010 
	  //将int类型的十进制转换成16进制
	  String s2 = Integer.toHexString(10);
	  System.out.println(s2); //a  
	  //将int类型的十进制转换成8进制
	  String s3 = Integer.toOctalString(10);
	  System.out.println(s3); //12  
	  //int-->Integer
	  Integer i3 = Integer.valueOf(10);  
	  //String--->Integer
	  Integer i4 = Integer.valueOf("10");
	  System.out.println(i3);
	  System.out.println(i4); 
	 }
}
