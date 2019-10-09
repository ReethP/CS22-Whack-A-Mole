package whack;
public class GameField{
	private Hole[] holes;
	private Mallet mallet;
	private Player player;
	private int score;
	// private Menu menu;

	public GameField(){
		this.holes = new Hole[6];
		for(int i = 0; i<6;i++){this.holes[i] = new Hole(5,5,5,5);}
		this.mallet = new Mallet();
		this.player = new Player("Ethan");
		this.score = 0;
		// this.Menu
	}

	protected void addScore(int score){
		this.score+=score;
	}
}