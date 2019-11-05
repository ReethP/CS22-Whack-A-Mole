package whack;
import java.util.Scanner;

public class TimerThread implements Runnable{
	int timer;
	public TimerThread(int timer){this.timer = timer;}
	public void run(){
		while(this.timer>0){
			System.out.println("Time: "+this.timer);
			this.timer = this.timer-1;
			try{Thread.sleep(1000);}catch (InterruptedException e) {}
		}
	}

	public int getTime(){return this.timer;}
}