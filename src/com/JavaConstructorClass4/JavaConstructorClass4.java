package com.JavaConstructorClass4;

public class JavaConstructorClass4 {
	
	
	int num1=0;
	int num2=0;
	JavaConstructorClass4(){ //Constractor
		System.out.println("Default contructor trigger!!");
		num1=10;
		num2=20;
	}
	
	JavaConstructorClass4(int number1, int number2){ //Constractor
		System.out.println("Parameterized contructor trigger!!");
		num1=number1;
		num2=number2;
	}
	public static void main(String[] args) {
		
		JavaConstructorClass4 c=new JavaConstructorClass4();
		c.mySum();
		
		JavaConstructorClass4 c2= new JavaConstructorClass4 (100,200);
		c2.mySum();
	}
	void mySum(){
		int sum=num1+num2;
		System.out.println("My Sum is:"+sum);
	}
}
