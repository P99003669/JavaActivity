import java.util.Scanner;
public class ExceptionTwo {

	public static void main(String[] args) {
		int overs;
		int over_number;
		int[] arr = null;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of overs");
        overs = sc.nextInt();
        try {
            arr = new int[overs];
        }
        catch(NegativeArraySizeException na) {
        	System.out.println("java.lang.NegativeArraySizeException");
        }
        System.out.println("Enter the number of runs for each over");
        for(int i=0;i<overs;i++) {
			arr[i] = sc.nextInt();
        }
        System.out.println("Enter over number");
        over_number = sc.nextInt();
        try {
        	System.out.println("Runs scored in this over : " + arr[over_number]);
        }
        catch(ArrayIndexOutOfBoundsException ai) {
        	System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }
	}

}