package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String fruit = JOptionPane.showInputDialog( "Is an avocado a fruit?");
				// 3.  Use an if statement to check if their answer is correct
				if(fruit.equalsIgnoreCase("yes")) {
					score += 1;
				}
				
				 String tomato = JOptionPane.showInputDialog( "Is a Tomato a vegetable?");
				
				 if(tomato.equalsIgnoreCase("yes")) {
					 score += -1;
				 }
				 // 4.  if the user's answer was correct, add one to their score 
				 String spinach = JOptionPane.showInputDialog("Is Spinach a vegetable?");
		
				 if(spinach.equalsIgnoreCase("yes")) {
					 score += 1;
				 }
				 String banana = JOptionPane.showInputDialog("Is a banana a fruit?");
				 
				 if(banana .equalsIgnoreCase("yes")) {
					 score += 1;
				 }
				 // MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null,"Your final score is " + score );
	}
}
