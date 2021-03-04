package Hash;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Bowler,Wicket>hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Player Nmae: ");
			String name = sc.next();
			System.out.println("Enter Wickets Separated by |");
			
			String str = sc.next();
			String array[] = str.split("|");
			for(int i=0;i<array.length;i++)
			{
				hm.put(new Bowler(name),new Wicket(array[i],new Bowler(name)));
			}
			 hm.forEach((key, value) -> System.out.println(key + " : " + value));
			System.out.println("Do you need to Search for a Player: ");
			String val = sc.next();
			
			if(val=="no")
			{
				System.exit(0);
			}
			
		}
		
	}

	@Override
	public String toString() {
		
		return "Player Name: "+" ";
	}
		

	}