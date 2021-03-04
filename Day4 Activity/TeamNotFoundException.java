import java.util.Scanner;
public class TeamNotFoundException extends Exception {
	TeamNotFoundException(String s){  
		  super(s);  
		 }  

	public static void main(String[] args) throws TeamNotFoundException {
		String win_team;
		String run_team;
		boolean test = false;
		String[] teams = {"Chennai Super Kings" , "Sun Risers Hyderabad" , "Delhi Capitals" , "Kings XI Punjab" , "Kolkata Knight Riders" , "Mumbai Indians" , "Rajasthan Royals" , "Royal Challengers Bangalore"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expected winner team of IPL Season 13");
        win_team = sc.nextLine();
        System.out.println("Enter the expected runner team of IPL Season 13");
        run_team = sc.nextLine();
        for(int i=0;i<teams.length;i++) {
        
        	 if(win_team.equalsIgnoreCase(teams[i]) == run_team.equalsIgnoreCase(teams[i])) {
         		test = true;
         		break;
         	}
        }
         if(test) {
        	 System.out.println("Expected IPL Season 13 winner : " + win_team);
      		System.out.println("Expected IPL Season 13 runner : " + run_team);
         }
         	else {
         		throw new TeamNotFoundException("TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
         	}
 
       
	}
}