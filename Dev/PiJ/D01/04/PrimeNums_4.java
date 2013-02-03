public class PrimeNums
{
	public static void main(String[] args)
	{
		int i = 0;
		String str = System.console().readline();
		int n = Integer.parseInt(str);
		while (i < n)
		{	i++;
			if (n % i != 0)
			{ 	System.out.println("Not prime!");
				break;
			}
		}
	}
}
	