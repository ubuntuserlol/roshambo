package com.mcnz.rps;
import java.util.Random;

public class GameService {
	

	public GameSummary playRoshambo(String clientGesture) {
        Random random = new Random();
        String randomChoice;

		int randomInt = random.nextInt(3);
        if (randomInt == 0) {
            randomChoice = "scissors";
        }
        else if (randomInt == 1) {
            randomChoice = "paper";
        }
        else {
            randomChoice = "rock";
        }

		String result = "error";
		if (clientGesture.equals("scissors")) {
			if (randomChoice.equals("scissors")) {
                result = "tie";
            }
            else if (randomChoice.equals("paper")) {
                result = "win";
            }
            else {
                result = "lose";
            }
		}
		if (clientGesture.equals("paper")) {
			if (randomChoice.equals("scissors")) {
                result = "lose";
            }
            else if (randomChoice.equals("paper")) {
                result = "tie";
            }
            else {
                result = "win";
            }
		}
		if (clientGesture.equals("rock")) {
			if (randomChoice.equals("scissors")) {
                result = "win";
            }
            else if (randomChoice.equals("paper")) {
                result = "lose";
            }
            else {
                result = "tie";
            }
		}
		GameSummary gameSummary = new GameSummary(clientGesture, randomChoice, result);
		return gameSummary;
	}

}  
