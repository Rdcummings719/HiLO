import java.util.Scanner;
import java.util.Random;
public class HiLo {

	public static void main(String[] args) {
		
		int dice1;
		int dice2;
		int dice3;
		
	welcome();	

	}

	public static void welcome() {
		System.out.println(" Welcome to a Hi or Lo dice game");
		System.out.println(" You may choose to play with up to three dice");
		System.out.println(" How many would you  like to use?");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Enter a number between 1 and 3");
		int myInt = keyboard.nextInt();
		
		
		    int dice1=(int)(Math.random()*6+1);
		    int dice2=(int)(Math.random()*6+1);
		    int dice3=(int)(Math.random()*6+1);
		
		
	
	
		
	
	
	
	
		
	}
	
	
	
}
