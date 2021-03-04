package List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class PlayersList {
	public static void main(String[] args)throws Exception
	{
		
		ArrayList<String> al=new ArrayList<String>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the player details");
		System.out.println("Enter the player name");
		al.add(br.readLine());
		System.out.println("Enter age");
		al.add(br.readLine());
		System.out.println("Enter Country");
		al.add(br.readLine());
		System.out.println("Player Details");
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("Enter Skill");
		String s1=br.readLine();
		System.out.println("Enter the position to add the skill");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Player details");
		al.set(2, s1);
		for(String rs:al)
		{
			System.out.println(rs);
		}
		System.out.println("Enter the position of the details to be removed");
		int n1=Integer.parseInt(br.readLine());
		System.out.println("Player Details");
		al.remove(n1);
		for(String restr:al)
		{
			System.out.println(restr);
		}
	}


}