package Question1;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Match");
		String match = sc.next();
		System.out.println("Enter the Scores: ");
		String score = sc.next();
		
		System.out.println("Enter the Match");
		String match1 = sc.next();
		System.out.println("Enter the Scores: ");
		String score1 = sc.next();
		System.out.println("Enter the Match");
		String match2 = sc.next();
		System.out.println("Enter the Scores: ");
		String score2 = sc.next();
		
		SortScore obj = new SortScore(match,score);
		SortScore obj1 = new SortScore(match1,score1);
		SortScore obj2 = new SortScore(match2,score2);
		try
		{
		Thread th = new Thread(obj);
		obj.start();
		obj.join();
		Thread th1 = new Thread(obj1);
		obj1.start();
		obj1.join();
		Thread th2 = new Thread(obj2);
		obj2.start();
		obj2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		

	}
}