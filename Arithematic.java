import java.util.*;

class Arithematic
{
	static int calc_value(int x,int y,int z)
	{
		if(x<0 || x>32767 || y<0 || y>32767 || z<=0 || z>4)
		{
			return -1;
		}
		else
		{
          if(z==1)
		  {
			  return x+y;
		  }
          else if(z==2)
		  {
			  if(x>=y)
			  {
				  return x-y;
			  }
			  else{
				  return y-x;
			  }
		  }
          else if(z==3)
		  {
			  return x*y;
		  }
          else{
			  return x/y;
		  }		  
		}
		
	}
	
	
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int num1 = sc.nextInt();
  int num2 = sc.nextInt();
  int num3 = sc.nextInt();
  int value = calc_value(num1,num2,num3);
  if(value==-1)
  {
	  System.out.println("Invalid");
  }
  else{
	  System.out.println(value);
  }
}
}