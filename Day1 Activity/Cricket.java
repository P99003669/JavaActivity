import java.util.*;
class Cricket
{
	static void print_array(int x[],int y,int z)
	{   int arr[] = new int[y];
	int j=0;
		if(y<=0)
		{
			System.out.println("Invalid Array size!");
		}
		else 
		{
			for(int i=1;i<y;i+=2)
			{   
				if(x[i]>=z)
				{
			      arr[i]=x[i-1];		
                  				  
				}
			}
		}
		for(int k=0;k<y;k++)
		{
			if(arr[k]!=0)
			{
				System.out.println(arr[k]);
			}
		}
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
		int score=sc.nextInt();
		print_array(array,size,score);
		
	}
}