package whack;
import java.util.Random;
public class Hole{
	private Mole mole;
	private int timer;
	private int holeLength;
	private int holeWidth;
	private boolean hasMole;

	//TimerTask
	public Hole(int xcor, int ycor, int holeLength,int holeWidth){
		Mole mole = new Mole(this,xcor,ycor,holeLength,holeWidth);
		this.mole = mole;
		this.timer = 0;
		this.holeLength = holeLength;
		this.holeLength = holeWidth;
		this.hasMole = false;
	}

	public void tryUnhideMole(){
		Random r = new Random();
		int create = r.nextInt(101);
		if(create<30){
			this.mole.unhide();
			this.hasMole = true;
			int duration = r.nextInt(3)+3;
			this.mole.setTime(duration);
			Thread moleth = new Thread(this.mole);
			moleth.start();
		}

	}


	protected void hit(){
		this.mole.trytohit();
	}

	protected void hideMole(){
		this.hasMole = false;
	}

	protected boolean hasMole(){
		return this.hasMole;
	}
}