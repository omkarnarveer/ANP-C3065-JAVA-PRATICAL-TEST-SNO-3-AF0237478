package com.mygame.main;
import com.mygame.view.*;
import com.mygame.service.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameView viewObj = new GameView();
		GameService serviceObj = new GameService();
		String name[] = viewObj.displayCityNamesWithBlanks();
		String cityName[] = serviceObj.getCityNameService();
		
		for(int i = 0 ; i <5 ; i++) {
			String strName=String.valueOf(cityName[i]);
			//System.out.println(strName);
			System.out.println('\n'+name[i]);
			System.out.println("Guess the Name of the City: ");
			Scanner scanner=new Scanner(System.in);
			String city=scanner.nextLine();
			
			if (city.equals(strName)){
				
				System.out.println("Correct Guess.");
			}
			
			else {
				
				System.out.println("Incorrect Guess.");
				System.out.println("Correct Name of the City is: "+cityName[i]);
			}
		}		
	}	
}