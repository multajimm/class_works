package com.telentech;

public class JavaLoopPracticeC3 {

	public static void main(String[] args) {
		//while condition
		int counter1=5;
		while (counter1>1){
			System.out.println("Telentech");
			counter1--;
		}
		System.out.println("Outside of the loop");
		
		
		//do while condition
		int counter2=1;
		do{
			System.out.println("Telentech Do-While Loop");
		}
		while (counter2>3);
		
		System.out.println("Outside of the loop");
		
		
		//For Loop
		for(int i=0; i<10; i++){
			System.out.println("Telentech");
		}
		
		for(int i=1; i<4; i++){ //parent loop
			for(int j=1; j<3; j++) //child loop
			System.out.println("Telentech");
		}
	}

}
