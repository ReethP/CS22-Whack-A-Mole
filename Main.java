package main;
import whack.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int time = 60;
	int command;
	GameField gamefield = new GameField();
	Game game = new Game(gamefield,time);
	Thread gameth = new Thread(game);
	gameth.start();
	// System.out.println("Enter a command: ");
	while(game.getTime()>0){
		command = sc.nextInt();
	}
	}
}
