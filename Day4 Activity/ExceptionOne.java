import java.util.Scanner;
public class ExceptionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String runs_scored;
       int overs_faced;
       float runrate;
       int runs = 0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter runs scored");
       runs_scored = sc.nextLine();
       
       try {
    	   runs = Integer.parseInt(runs_scored);
       }
       catch(NumberFormatException nf){
    	   System.out.println("java.lang.NumberFormatException");
       }
       
       System.out.println("Enter overs faced");
       overs_faced = sc.nextInt();
       
       try {
    	   runrate = runs/overs_faced;
    	   System.out.println("Current Run Rate : " + runrate);
       }
       catch(ArithmeticException ae) {
    	   System.out.println("java.lang.ArithmeticException");
       }
	}

}