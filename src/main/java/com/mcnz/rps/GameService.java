package com.mcnz.rps;
import java.util.Random;

public class GameService {
	
	public String getRandom(String[] array) {
		    int rnd = new Random().nextInt(array.length);
		    return array[rnd];
		}
		
	public GameSummary playRoshambo(String clientGesture) {
		String result = "error";
		String[] options = {"rock", "paper", "scissors"};
		Random ran = new Random();
	        int randomNumber = ran.nextInt(options.length);
	        String randomArrayElement = options[randomNumber];
		String chosen = randomArrayElement;
		String input = clientGesture;
		if (input.equals("scissors")) {
			if (chosen.equals("rock")){
				result = "lose";
			}
			if (chosen.equals("paper")){
				result = "win";
			}
			if (chosen.equals("scissors")){
				result = "tie";
			}			
		}

		if (input.equals("paper")) {
			if (chosen.equals("rock")){
				result = "win";
			}
			if (chosen.equals("paper")){
				result = "tie";
			}
			if (chosen.equals("scissors")){
				result = "lose";
			}
		}

		if (input.equals("rock")) {
			if (chosen.equals("rock")){
				result = "tie";
			}
			if (chosen.equals("paper")){
				result = "lose";
			}
			if (chosen.equals("scissors")){
				result = "win";
			}
		}
		GameSummary gameSummary = new GameSummary(clientGesture, chosen, result);
		return gameSummary;
	}
}
