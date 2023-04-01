package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		context.getBean(GamingConsole.class).up();
		
		// var game = new MarioGame();
		// var game = new SuperContraGame();
		//var game = new PacmanGame();
		//var gameRunner = new GameRunner(game);
		//gameRunner.run();
		
	}
  
}
