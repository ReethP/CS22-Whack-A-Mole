package main;
import whack.*;
import java.util.Scanner;

class TimerThread extends Thread{
	public int start;
	public TimerThread(int start){this.start = start;}
	public void run(){
		while(this.start>0){
				try{Thread.sleep(1000);}catch(Exception e){}
				// System.out.println("Timer: "+this.start);
				this.start-=1;}}
	// getTime
}

	  
public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	TimerThread timer = new TimerThread(5);
	timer.start();
	int hello;
	System.out.print("In the main yo: ");
	hello = sc.nextInt();
	GameField gamefield = new GameField();
	while(true){
		if(timer.start == 0) break;}
	// while(true){System.out.println("Current Timer: "+timer.start);}
	}
}