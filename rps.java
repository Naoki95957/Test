package rps;

import java.util.Scanner;

import javax.swing.JFrame;
@SuppressWarnings("resource")
public class rps {	
	public static void main(String[] args) {
		rpsConsole();
	}
	public static void rpsG(){
		rpsgui obj = new rpsgui();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setLocation(800, 300);
		obj.setSize(300, 75);
		obj.setVisible(true);
	}
	public static void rpsConsole(){
	System.out.println("What's your name?");
	Scanner name = new Scanner(System.in);
	String namer = name.nextLine();
		System.out.println("Hello " + namer + ", can I play Rock-Paper-Scissors with you?");
		System.out.println("Don't worry, I can't cheat. I'm a computer and my choices are made before you!");
		Scanner c = new Scanner(System.in);
		System.out.println("(Yes or no)");
		String again = c.nextLine();
			if (again.equalsIgnoreCase("yes")||again.equalsIgnoreCase("1")){
				System.out.println("How many times would you like to play?");
				Scanner num = new Scanner(System.in);
				int nump = num.nextInt();
			 	int count = 0;
			 	System.out.println("What do you choose? Rock, Paper, or Scissors?");
				while (count <= nump){
					Scanner userp = new Scanner(System.in);
					String userc = userp.nextLine(); 
					int counter = 1;
					while (counter == 1){
			double cpu = Math.random();
		if (cpu < 0.33333){
			//Rock
			if (userc.equalsIgnoreCase("rock")||userc.equalsIgnoreCase("1")){
				System.out.println("We got a draw! We both picked Rock");
				System.out.println("");
				counter--;
				count++;
				if(count <= nump-1){
				System.out.println("What do you choose? Rock, Paper, or Scissors?");}
				

				}
			if (userc.equalsIgnoreCase("paper")||userc.equalsIgnoreCase("2")){
				System.out.println("Congradulations " + namer + "! You win! Paper beats Rock!");
				System.out.println("");
				counter--;
				count++;
				if(count <= nump -1){
					System.out.println("What do you choose? Rock, Paper, or Scissors?");
				}
				
			
			}
			if (userc.equalsIgnoreCase("scissors")||userc.equalsIgnoreCase("3")){
				System.out.println("Sorry, but... I win! Rock beats Scissors!");
				System.out.println("");
				counter--;
				count++;
				if(count <= nump-1){
					System.out.println("What do you choose? Rock, Paper, or Scissors?");
				}
				
			
			}}
		if (cpu > 0.33333 && cpu < 0.66666){
			//Paper
			if (userc.equalsIgnoreCase("paper")||userc.equalsIgnoreCase("2")){
				System.out.println("We got a draw! We both picked Paper!");
				System.out.println("");
				counter--;
				count++;
				if(count <= nump-1){
					System.out.println("What do you choose? Rock, Paper, or Scissors?");
				}
				
				
			}
			
			if (userc.equalsIgnoreCase("rock")||userc.equalsIgnoreCase("1")){
				System.out.println("Sorry, but... I win! Paper beats Rock!");
				System.out.println("");
				counter--;
				count++;
				if(count <= nump-1){
					System.out.println("What do you choose? Rock, Paper, or Scissors?");
				}
				
				
			}
			if (userc.equalsIgnoreCase("scissors")||userc.equalsIgnoreCase("3")){
				System.out.println("Congradulations " + namer + "! You win! Scissors beats Paper!");
				System.out.println("");
				counter--;
				count++;
				if(count <= nump-1){
					System.out.println("What do you choose? Rock, Paper, or Scissors?");
				}
				
				
			}}
		if (cpu > 0.66666){
			//Scissors
			if (userc.equalsIgnoreCase("scissors")||userc.equalsIgnoreCase("3")){
				System.out.println("We got a draw! We both picked Scissors!");
				System.out.println("");
				counter--;
				count++;
				if(count <= nump-1){
					System.out.println("What do you choose? Rock, Paper, or Scissors?");
				}
				
			
			}
			if (userc.equalsIgnoreCase("2")||userc.equalsIgnoreCase("paper")){
				System.out.println("Sorry, but... I win! Scissors beats Paper!");
				System.out.println("");
				counter--;
				count++;
				if(count <= nump-1){
					System.out.println("What do you choose? Rock, Paper, or Scissors?");
				}
				
				
			}
			if (userc.equalsIgnoreCase("rock")||userc.equalsIgnoreCase("1")){
				System.out.println("Congradulations " + namer + "! You win! Rock beats Scissors!");
				System.out.println("");
				counter--;
				count++;
				if(count <= nump-1){
					System.out.println("What do you choose? Rock, Paper, or Scissors?");
				}
				
				
				
			}
		}}
		
		if (count >= nump){	
			if (nump == 1 ){
				System.out.println("Well, we played " + nump + " time. Do you want to play some more?");
			}else{
				System.out.println("Well, we played " + nump + " times. Do you want to play some more?");
				}
			System.out.println("Yes or no");
				Scanner b = new Scanner(System.in);
		String againa = b.nextLine();
		if (againa.equalsIgnoreCase("yes")||againa.equalsIgnoreCase("1")){
			System.out.println("How many more times would you like to play?");
				Scanner num2 = new Scanner(System.in);
					 nump = num2.nextInt();
				 	 count = 0;
				 	System.out.println("What do you choose? Rock, Paper, or Scissors?");
		}else{
			System.out.println("Okay " + namer + ", I had fun!");
			count++;
			}}}
						
				}else{
		System.out.println("... okay then. Be that way " + namer + "!");
	}
				
	
	}
	}		
	

	
