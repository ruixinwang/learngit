import java.util.*;
public class Except 
{
   
	public int divide(int a,int b)
	{
		int m=0;
		Scanner sc = new Scanner(System.in);//System.in ��ʾ����
		
		try
		{
			m= sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.printf("���벻�Ϸ�\n");
		}
				
		try
		{
			m = a/b;
			System.out.printf("����\n");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
		//System.out.printf("m=%m\n",m);
		return m;
	}	
}
	
	

