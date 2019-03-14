
public class 可变参数 
{
	public int getSum(int ... x)
	{
		int sum = 0;
		for(int i = 0; i<x.length;i++) // x.length 表示x 所代表的参数的个数
			sum+=x[i];
		return sum;	
	}
}
/*从1 到 最后一个参数都是 int 型
 *称x 是方法getSum中参数列表中的“参数代表”
 *“参数代表’ 必须是参数列表的最后一个
 *参数代表可以通过下标运算来表示参数列表的具体参数
 *即 x[0] x[1] x[i]
 **/
 */