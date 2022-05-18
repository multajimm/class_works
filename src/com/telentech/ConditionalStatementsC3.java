package com.telentech;

//Class_Three//Date:12/19/2021
public class ConditionalStatementsC3 {

	public static void main(String[] args) {
	
		  int number1=10; int number2=13; //change value to 30 also if
		  if(number2>number1 || number2>100){ //use logical && at home also
		  System.out.println("The bigger Number is="+number2); }
		  else{System.out.println("Number2 is not bigger than NUmber1");
		  }
		  int c=10;int d=18; int e=c+d; System.out.println("New Number is ="+e);
		 

		// change numbers then practice
		/*
		 * if (number2>number1 && number2>100){ //use logical && at home also
		 * System.out.println("number2 is my Favourite Number"); }else if
		 * (number2>number1 && number2>50){
		 * System.out.println("number2 is not my Favourite Number"); } else if
		 * (number2>number1 && number2>25){
		 * System.out.println("I do not like NUmber2 as Well"); } else {
		 * System.out.println("number12 is t my Favourite Number"); }
		 */

		/*
		 * // Smallest Number
		 
		int x = 10;
		int y = 20;
		int z = 30;
		if (x < z && x < y) {
			System.out.println("X is the Smallest Number=" + x);
		} else if (y > x && y > z) {
			System.out.println("y is the Bigger Number=" + y);
		} else {
			System.out.println("y is the Biggest Number=" + z);
		}

		// Bigger Number
		int a = 10;
		int b = 20;
		int c = 30;
		if (b < a && b < c) {
			System.out.println("A is the Smallest Number=" + a);
		} else if (b > a && b < c) {
			System.out.println("B is the Bigger Number=" + b);
		} else if (b < a && b > c) {
			System.out.println("C is the Biggest Number=" + c);
		} else {
			System.out.println("B is the Bigger Number in these three=" + b);
		}

		// Biggest Number
		int p = 10;
		int q = 20;
		int r = 30;
		if (p < r && p > q) {
			System.out.println("P is the Smallest Number=" + p);
		} else if (p > q || q > r) {
			System.out.println("Q is the Bigger Number=" + q);
		} else {
			System.out.println("R  is the Biggest Number in these three=" + r);
		}*/
		
		//Javaswitch Practice
		int dayNum= 50;
		switch(dayNum){
		

		
		case 1: 
			System.out.println("This is Sunday");
			break;
		case 2: 
			System.out.println("This is Monday");
			break;
		case 3: 
			System.out.println("This is Tuesday");
			break;
		case 4: 
			System.out.println("This is Wedday");
			break;
		case 5: 
			System.out.println("This is Thursday");
			break;
		case 6: 
			System.out.println("This is Friday");
			break;
		case 7: 
			System.out.println("This is Satday");
			break;
		default: 
			System.out.println("Invalid Number for the day\nPlease put something between 1-7");
		}
		
		System.out.println("Coming Out from the Switch Statement");
		
		
		//
	}
}
