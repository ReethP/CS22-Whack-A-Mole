package whack;
public class Mole{
	private float area;
	private int xcor;
	private int ycor;
	private int length;
	private int width;
	private boolean hidden;

	public Mole(int xcor, int ycor, int length, int width){
		this.xcor = xcor;
		this.ycor = ycor;
		this.hidden = true;
		this.length = length;
		this.width = width;
		this.area = length*width;
	}

	protected void unhide(){}
	protected void hide(){}
	protected void adjustSpeed(){}
	protected void getHit(){}
	protected void addScore(){}
	protected boolean getHiddenStatus(){return this.hidden;}

}