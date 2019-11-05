package whack;
public class Mole implements Runnable{
	private float area;
	private int xcor;
	private int ycor;
	private int length;
	private int width;
	private boolean hidden;
	private int time;
	private Hole hole;

	public Mole(Hole hole,int xcor, int ycor, int length, int width){
		this.xcor = xcor;
		this.ycor = ycor;
		this.hidden = true;
		this.length = length;
		this.width = width;
		this.area = length*width;
		this.time = 0;
		this.hole = hole;
	}

	protected void trytohit(){
		if(!hidden){this.hidden = false;}
	}
	protected void unhide(){this.hidden = false;}
	protected void setTime(int time){this.time = time;}
	protected void hide(){}
	protected void adjustSpeed(){}
	protected void getHit(){}
	protected void addScore(){}
	protected boolean getHiddenStatus(){return this.hidden;}

	public void run(){
		while(this.time>0){
			this.time = this.time-1;
			try{Thread.sleep(1000);}catch (InterruptedException e){}
		}
		this.hidden = true;
		this.hole.hideMole();
	}

}