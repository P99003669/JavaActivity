import java.util.*;

class LeapYear
{   static int check_leap(int x)
	{
		if(x%4==0 || x%400==0)
		{
			return 1;
		}
		else if(x<0)
		{
			return -1;
		}
		else{
			return 0;
		}
	}
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      int year = sc.nextInt();
      int value = check_leap(year);	  
	  if(value==0)
	  {
		  System.out.println("No");
	  }
	  else if(value==1)
	  {
		  System.out.println("Yes");
	  }
	  else{
		  System.out.println("Invalid Input");
	  }
	}
}