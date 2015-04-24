
public class TestExcep_1 
{
	public static void main(String[] args)
	{
		Except aa= new Except();
		try
		{
			aa.divide(6, 2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.printf("exception\n");
			//e.printStackTrace();
		}
		finally
		{
		System.out.printf("11\n");
		}
		
	}

}

