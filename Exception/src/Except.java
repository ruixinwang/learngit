import java.util.*;
public class Except 
{
   
	public int divide(int a,int b)
	{
		int m=0;
		Scanner sc = new Scanner(System.in);//System.in 表示键盘
		
		try
		{
			m= sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.printf("输入不合法\n");
		}
				
		try
		{
			m = a/b;
			System.out.printf("除法\n");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
		//System.out.printf("m=%m\n",m);
		return m;
	}	
}
	
	

