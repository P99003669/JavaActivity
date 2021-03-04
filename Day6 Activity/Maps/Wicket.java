package Hash;

public class Wicket {

	private String Playername;
	private Bowler bowler;
	public Wicket(String playername, Bowler bowler) {
		super();
		Playername = playername;
		this.bowler = bowler;
	}
	public String getPlayername() {
		return Playername;
	}
	public void setPlayername(String playername) {
		Playername = playername;
	}
	public Bowler getBowler() {
		return bowler;
	}
	public void setBowler(Bowler bowler) {
		this.bowler = bowler;
	}
}