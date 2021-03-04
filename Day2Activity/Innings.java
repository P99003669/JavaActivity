import java.util.*;

public class Innings
{
	private String teammate;
	private String inningname;
	private int runs;
	void setTeammate(String teammate)
	{
		this.teammate = teammate;
	}
	void setInningname(String inningname)
	{
		this.inningname = inningname;
	}
	void setRuns(int runs)
	{
		this.runs = runs;
	}
	String getTeammate()
	{
		return teammate;
	}
	String getInningname()
	{
		return inningname;
	}
	int getRuns()
	{
		return runs;
	}
	
	public void display()
	{
		System.out.println("Player Name: "+runs);
		System.out.println("Scored: "+runs);
		if(inningname.equals("first") || inningname.equals("First"))
		{
			System.out.println("More "+(runs+1)+"to win");
		}
		else
		{
			System.out.println("Match Ended");
		}
	}
}