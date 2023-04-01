package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game () {
		var game = new PacmanGame();
		return game;
	}
	
	// var game = new MarioGame();
	// var game = new SuperContraGame();
	//var game = new PacmanGame();
	//var gameRunner = new GameRunner(game);
	//gameRunner.run();
	
}
