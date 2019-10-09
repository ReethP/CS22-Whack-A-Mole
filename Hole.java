package whack;
public class Hole{
	private Mole mole;
	private int timer;
	private int holeLength;
	private int holeWidth;

	//TimerTask
	public Hole(int xcor, int ycor, int holeLength,int holeWidth){
		Mole mole = new Mole(xcor,ycor,holeLength,holeWidth);
		this.mole = mole;
		this.timer = 0;
		this.holeLength = holeLength;
		this.holeLength = holeWidth;}

	protected void hit(){}
}