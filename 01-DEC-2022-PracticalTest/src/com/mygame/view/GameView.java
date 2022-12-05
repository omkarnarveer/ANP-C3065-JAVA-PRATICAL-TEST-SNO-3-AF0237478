package com.mygame.view;
import com.mygame.service.*;
public class GameView {
	
	int randomNumberArr[]=new int[10];
	
	void generateRandomNumber(int count){
		
		int minimum=0;
		int maximum=count;
		
		for(int k=0;k<=count/2;k++) {
			
			int randomNumber=minimum + (int)(Math.random() * maximum);
			randomNumberArr[k]=randomNumber;
			//System.out.println(randomNumber);
		}
		
	}
	public String[] displayCityNamesWithBlanks(){

		GameService serviceObj=new GameService();
		String[] cityName=serviceObj.getCityNameService();
		
		for(int i=0;i<cityName.length;i++) {
			
			int length =cityName[i].length();
			char cityNameCharArr[]=new char[length];
			generateRandomNumber(length);
			
			for(int j=0;j<length;j++) {
				
				cityNameCharArr[j]=cityName[i].charAt(j);
				
				for(int k=0;k<randomNumberArr.length;k++) {	
					
					if(j==randomNumberArr[k])
					cityNameCharArr[j]='-';		
				}
			}
		}
		
	return cityName;
	}
}
