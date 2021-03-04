public class T20Match extends Match {

	@Override
	public float calculateRunRate() {
		float reqRunRate;
		reqRunRate=(getTarget()-getCurrentscore())/(20-getCurrentover());
		return reqRunRate;
	}

	@Override
	public int calculateBalls() {
		int cuo;
		cuo=120-((int)getCurrentover()*6);
		
		return cuo;
	}

	@Override
	public void display(double reqRunrate, int balls) {
		int runs;
		runs=getTarget()-getCurrentscore();
		System.out.println("Need "+runs+" runs in "+balls+" balls.");
		System.out.println("Required Runrate: "+reqRunrate);	
	}
}