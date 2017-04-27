package exercise_14_17;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import java.util.Scanner;

public class exercise_14_17 extends Application {
	
	
	public static double HEIGHT = 400;
	public static double WIDTH = 400;
	
	@Override
	
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		ObservableList<Node> list = pane.getChildren();
		
		primaryStage.setTitle("exercise_14_17");
		primaryStage.setScene(new Scene(pane, WIDTH, HEIGHT));
		Arc arc = new Arc(WIDTH / 4, HEIGHT - HEIGHT / 12, WIDTH / 5, HEIGHT / 12, 0 , 180);
		arc.setFill(Color.TRANSPARENT);
		arc.setStroke(Color.BLACK);
		list.add(arc);
		
		Line pole = new Line(arc.getCenterX(), arc.getCenterY() - arc.getRadiusY(), arc.getCenterX(), pane.getHeight() / 12);
		list.add(pole);
		
		Line holder = new Line(pole.getEndX(), pole.getEndY(), pane.getWidth() / 1.5, pole.getEndY());
		list.add(holder);
		Line hang = new Line(holder.getEndX(), holder.getEndY(), holder.getEndX(), pane.getHeight() / 6);
		list.add(hang);
		
		double radius = WIDTH / 10;
		Circle c = new Circle(holder.getEndX(), pane.getHeight() / 6 + radius, radius);
		c.setFill(Color.TRANSPARENT);
		c.setStroke(Color.BLACK);
		list.add(c);
		
		double [] p = getPointAtAngle(c, 220);
		Line leftArm = new Line(pane.getWidth() / 2, pane.getHeight() / 2, p[0], p[1]);
		list.add(leftArm);
		p = getPointAtAngle(c, 315);
		Line rightArm = new Line(pane.getWidth() / 1.2, pane.getHeight() / 2, p[0], p[1]);
		list.add(rightArm);
		
		p = getPointAtAngle(c, 270);
		Line body = new Line(p[0], p[1], p[0], pane.getHeight() / 1.6);
		list.add(body);
		
		Line leftLeg = new Line(body.getEndX(), body.getEndY(), pane.getWidth() / 2, pane.getHeight() / 1.3);
		list.add(leftLeg);
		
		Line rightLeg = new Line(body.getEndX(), body.getEndY(), pane.getWidth() / 1.2, pane.getHeight() / 1.3);
		list.add(rightLeg);
		
		primaryStage.show();
	}
	
	private double[] getPointAtAngle(Circle c, double angle) {
		double x = c.getCenterX() + c.getRadius() * Math.cos(Math.toRadians(angle));
		double y = c.getCenterY() - c.getRadius() * Math.sin(Math.toRadians(angle));
		
		return new double[] {x, y};
	}
	
	public static void main(String[] args) {
		Application.launch(args);
		Scanner input = new Scanner(System.in);
		
		String play;
		do {
			char[] word = getWord();
			
			char[] asterisks = new char[word.length];
			fillAsterisks(asterisks);
			
			int missed = 0;
			do {
				char guess = getGuess(asterisks);
				
				if(!isCorrectGuess(word, asterisks, guess))
					missed++;
			}
			while (!isWordFinish(asterisks));
			print(word, missed);
			
			System.out.println(" Do you want to guess another word? Enter y or n>");
			play = input.next();
		}
		while (play.charAt(0) == 'y');
	}
	
	public static char[] getWord() {
		String[] words = {"write", "that", "program", "monkey", "rooster", "dog",
				"pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
				"horse", "sheep"};
		String pick = words[(int)(Math.random() * words.length)];
		char[] word = new char[pick.length()];
		
		for (int i = 0; i < word.length; i++) {
			word[i] = pick.charAt(i);
		}
		return word;
	}
	
	public static void fillAsterisks(char[] list) {
		for (int i = 0; i < list.length; i++) {
			list[i] = '*';
		}
	}
	public static boolean isCorrectGuess(char[] word, char[] blanks, char guess) {
		boolean correct = false;
		int message = 2;
		for (int i = 0; i < word.length; i++) {
			if(word[i] == guess) {
				correct = true;
				if (blanks[i] == guess)
					message = 1;
				else{
					blanks[i] = guess;
					message = 0;
				}
			}
		}
		if (message > 0)
			print(message, guess);
		return correct;
	}
	public static boolean isWordFinish(char[] blanks) {
		for(char e: blanks) {
			if (e == '*')
				return false;
		}
		return true;
	}
	public static void print(char[] word, int missed) {
		System.out.print("The word is ");
		System.out.print(word);
		System.out.print("You missed " + missed + " times");
	}
	public static void print(int m, char guess) {
		System.out.print("\t" + guess);
		switch(m) {
		case 1 : System.out.println(" is already in the word"); break;
		case 2 : System.out.println(" is not in the word");
		}
	}
	public static char getGuess(char[] asterisks) {
		Scanner input = new Scanner(System.in);
		System.out.print("(Guess) Enter a letter in word ");
		System.out.print(asterisks);
		System.out.print(" > ");
		String g = input.next();
		return g.charAt(0);
	}
}