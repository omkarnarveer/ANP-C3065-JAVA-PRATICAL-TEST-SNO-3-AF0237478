package com.mygame.service;
import com.mygame.dao.GameDAO;

public class GameService {

	public String[] getCityNameService(){
		
		GameDAO daoObj=new GameDAO();
		String[] cityName=daoObj.getCityNames();
		
	return cityName;
	}
}
