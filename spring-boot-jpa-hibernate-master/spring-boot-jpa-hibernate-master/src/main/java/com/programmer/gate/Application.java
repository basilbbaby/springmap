package com.programmer.gate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.programmer.gate.service.SoccerService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	SoccerService soccerService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		
		soccerService.addBarcelonaPlayer("Neymar", "Jr", 6);
		
		
		List<String> players = soccerService.getAllTeamPlayers(1);
		System.out.println("**************The current team players for Barca is*******************");

		for(String player : players)
		{
			
			System.out.println("Introducing Barca player => " + player);
		}
		
		
		List<String> pList=soccerService.getAllTeamPlayers(2);
		System.out.println("**************The current team players for RealMadrid is*******************");

		
		for (String string : pList) {
			
			System.out.println("Introducing RealMadrid palyer => "+ string);
		}
	}
}