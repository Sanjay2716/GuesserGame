import java.util.Scanner;

class Guesser{
	int gnum;
	public int guessnum(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Guesser please enter your number in the range 1-10 ");
		gnum=sc.nextInt();
		return gnum;
	}
}
class Player{
	int pnum1;
	public int pGuessnum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Players please guess the number in the range 1-10 ");
		pnum1=sc.nextInt();
		return pnum1;
	}
}
class umpair{
	int numFromGuesser;
	int numFromP1;
	int numFromP2;
	int numFromP3;
	public void collectNumFromGuesser() {
		Guesser g=new Guesser();
		numFromGuesser=g.guessnum();
	}
	public void collectNumFromPlayer() {
		Player p1= new Player();
		Player p2= new Player();
		Player p3= new Player();
		numFromP1=p1.pGuessnum();
		numFromP2=p2.pGuessnum();
		numFromP3=p3.pGuessnum();
	}
	public void compare() {
		if(numFromGuesser<=10 || numFromP1<=10 && numFromP2<=10 && numFromP3<=10 ) {
			if(numFromGuesser==numFromP1) {
				 if (numFromGuesser==numFromP2 && numFromGuesser==numFromP3) 
					System.out.println("All Players Guessed Correctly");
				 else if(numFromGuesser==numFromP2)
					 System.out.println("Only Player 1,2 Guessed Correctly");
				 else if(numFromGuesser==numFromP3)
					 System.out.println("Only Player 1,3 Guessed Correctly");
				 else
				System.out.println("Player 1 Own The Game");
			}

			else if(numFromGuesser==numFromP2)
				if(numFromGuesser==numFromP3)
					System.out.println("Player 2 and 3 Own The Game");
				else
				System.out.println("Player Two Won The Game");
			else if(numFromGuesser==numFromP3)
				System.out.println("Player Three Won The Game");
			else
				System.out.println("All Players Guessed The Wrong Number");
			
		}	
		else
			System.out.println("you have enter the more that 10");
	}
	}

public class GusserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		umpair u=new umpair();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		
		
		
	}

}
