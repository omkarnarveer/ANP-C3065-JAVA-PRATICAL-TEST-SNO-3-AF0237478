package com.mygame.main;
import com.mygame.view.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameView viewObj = new GameView();
		String name[] = viewObj.displayCityNamesWithBlanks();
		
		for(int i = 0 ; i <5 ; i++) {
			
			System.out.println('\n'+name[i]);
			System.out.println("Guess the Name of the City: ");
			java.util.Scanner scanner=new java.util.Scanner(System.in);
			String city=scanner.nextLine();
			
			if (city==name[i]){
				
				System.out.println("Correct Guess.");
			}
			else {
				
				System.out.println("Incorrect Guess.");
				System.out.println("Correct Name of the City is: "+name[i]);
			}
		}		
	}	
}