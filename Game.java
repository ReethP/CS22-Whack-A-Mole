package whack;
import java.util.Scanner;

public class Game implements Runnable{
	private GameField gamefield;
	private int time;
	private TimerThread timerthread;
	public Game(GameField gamefield,int time){
		this.gamefield = gamefield;
		this.time = time;
		this.timerthread = new TimerThread(time);
	}
	public void run(){
	Thread timerth = new Thread(this.timerthread);
	timerth.start();
	while(timerthread.getTime()>0){
		this.gamefield.makeMoles();
		this.gamefield.printGame();
		try{Thread.sleep(1000);}catch (InterruptedException e) {}
								  }
					}

	public int getTime(){return this.time;}
}