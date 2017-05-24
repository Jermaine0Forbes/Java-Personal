package test_java;

import java.util.Scanner;

import basic.Actions;

public class Array_Test {
	
	public static void main(String[] args){
		
		String[] cats = {"felix","tom","garfield","lionel"};
		String[] turtles = {"leonardo", "raphael","donatello","michelangelo"};
		String[] questions = {
			"how do you feel today?",
			"what will make you life feel complete?",
			"what social goal do you want to accomplish this year?",
			"how will you accept the fact that you are getting older?"
			
		};
		String[] answers = new String[4];
		Actions act = new Actions();
		Scanner sc = new Scanner(System.in);
		
		
		for(int x = 0; x < questions.length; x++){
			
			act.print(questions[x]);
			answers[x] = sc.nextLine();
		}
		
		
		
		
		
		for(String value : answers ){
			
			act.print(value);
		}
		
		
		
	}

}
