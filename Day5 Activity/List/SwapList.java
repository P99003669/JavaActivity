package List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class SwapList {
	public static void main(String[] args)throws Exception {
		ArrayList<String> al=new ArrayList<String>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		for(int i=0;i<5;i++)
		{
			al.add(br.readLine());
		}
		for(String s1:al)
		{
			System.out.println(s1);
		}
		System.out.println("Enter swap positions");
		int n=Integer.parseInt(br.readLine());
		Collections.swap(al,n,0);
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}