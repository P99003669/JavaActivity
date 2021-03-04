package Set;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet1{

		public static void main(String[] args) {
		
			HashSet<String> hs = new HashSet<>();
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			for(int i=0;i<size;i++)
			{
				hs.add(sc.next());
			}
			System.out.println(hs.size());

		}

	}