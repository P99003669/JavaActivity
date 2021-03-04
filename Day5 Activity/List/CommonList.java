package List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class CommonList {
	public static void main(String[] args) throws Exception {
		
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> al1=new ArrayList<String>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the top 5 scorers of IPL Season 13");
	    al.add(br.readLine());
	    al.add(br.readLine());
	    al.add(br.readLine());
	    al.add(br.readLine());
	    al.add(br.readLine());
	    System.out.println("Enter the top 5 scorers of IPL Season 12");
	    al1.add(br.readLine());
	    al1.add(br.readLine());
	    al1.add(br.readLine());
	    al1.add(br.readLine());
	    al1.add(br.readLine());
	    System.out.println("Consistent run scores");
	    al.retainAll(al1);
	    
	    for(String s2:al)
		{
			System.out.println(s2);
		}
	}


}