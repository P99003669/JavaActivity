package List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CountList
{
	public static void main(String[] args)throws Exception 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int c=0,c1=0;
		for(int i=0;i<n;i++)
		{
			al.add(Integer.parseInt(br.readLine()));
		}
		for(int i=0;i<n;i++)
		{
			if(al.get(i)>=50 && al.get(i)<100)
				c=c+1;
			if(al.get(i)>=100)
			{
				c1=c1+1;
			}
			
		}
		System.out.println(c);
		System.out.println(c1);
	}
}
