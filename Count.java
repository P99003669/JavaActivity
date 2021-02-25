import java.util.*;
class Count
{   
    static int calc_count(int x[],int y,int z)
	{
		int count=0;
		for(int k=0;k<y;k++)
		{
			if(x[k]<0)
			{
				return -1;
			}
		}
		for(int j=0;j<y;j++)
		{
			if(x[j]==z)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		int element = sc.nextInt();
		if(size<=0)
		{
			System.out.println("Invalid");
			return;
		}
		
		int result = calc_count(array,size,element);
		if(result==-1)
		{
			System.out.println("Invalid");
		}
		else
		{
			System.out.println(result);
		}
	}
}