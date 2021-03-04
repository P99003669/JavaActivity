package Comparable;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RankingMain
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Ranking> al = new ArrayList<Ranking>();
		int players = Integer.parseInt(reader.readLine());
		
		int j=0;
		for(int i=0;i<players;i++)
		{
			System.out.println("Enter Name of Player"+j);
			String name = reader.readLine();
			System.out.println("Enter age of Player"+j);
			int age = Integer.parseInt(reader.readLine());
			al.add(new Ranking(age,name));
			j++;
		}
		Collections.sort(al);
		for(Ranking r:al)
		{
			System.out.println(r.getName()+" "+r.getScore());
		}

	}
	
}
			
			
	