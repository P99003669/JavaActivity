import java.util.*;

class Factorial
{   static void calc_fact(int x)
	{
		int array[] = new int[10];
		int temp=x;
		int i=0;
		while(temp!=0)
		{
			int rem = temp%10;
			temp= temp/10;
			int fact = calc(rem);
			array[i] = fact;
			i++;
		}
		for(int j=array.length-1;j>=0;j--)
		{
			if(array[j]!=0)
			{
				System.out.println(array[j]);
			}
		}
	}
	static int calc(int y)
	{
		if(y==1)
		{
			return 1;
		}
		else
		return y*calc(y-1);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		calc_fact(num);
	}
}