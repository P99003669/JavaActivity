import java.util.Scanner;
public class CustomException extends Exception {
	
	CustomException(String s){  
		  super(s);  
		 }  

	public static void main(String[] args) throws CustomException {
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player's name ");
		name = sc.nextLine();
		System.out.println("Enter player's age ");
		age = sc.nextInt();
		if(age<19) {
			throw new CustomException("CustomException: InvalidAgeRangeException");
		}
		else {
			System.out.println("Player name : " + name);
			System.out.println("Player age : " + age);
		}

	}

}