package com.telentech;

public class MethodPracticeClass4 {
	
	int number1=10;
	int number2=20;
	static  int number3=50;
	static int  num1=10;
	static int  num2=10;
	static final int myFinal=50;
	
	public static void main(String[] args) {
		MethodPracticeClass4 calc1 =new MethodPracticeClass4();
		System.out.println(calc1);
		double output1= calc1.addition(12, 13.3);
		double number3=100;
		double finalNumber= number3+output1;
		System.out.println("FinalNUmber:"+finalNumber);
		calc1.mySum();
		
		MethodPracticeClass4 calc2 =new MethodPracticeClass4();
		System.out.println(calc2);
		System.out.println(calc2.addition(12,19));
		calc2.number1=1;
		calc2.number2=2;
		
		
		MethodPracticeClass4 calc3 =new MethodPracticeClass4();
		
		calc2.mySum();
		MethodPracticeClass4.number3=100;
		calc2.mySum();
		
		MethodPracticeClass4.number3=50;
		calc2.mySum();
		
		number3=100;
		
		System.out.println(MethodPracticeClass4.multiply());
		
	}
	double addition(double number1, double d){
		double sum=number1+ d;
		return sum;
	}
	void mySum(){
		//System.out.println(number1+number2);
		System.out.println("Static variable value:"+number3);
		System.out.println(multiply());
	}
	
	static int multiply(){
		return (num1*num2);
	}
}
