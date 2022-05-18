package com.telentech;

public class MySuperCarC2 {
	int wheels=5;
	final int sideMirrors=2; /*attributes*/
	public static void main(String[] args) {
		
	MySuperCarC2 myCar1=new MySuperCarC2();
	System.out.println(myCar1);
		
   	 System.out.println("number of wheels:" + myCar1.wheels);
   	 myCar1.wheels= 3;
   /*System.out.println("number of wheels" + myCar1.wheels);
   	 MyJavaPractice myCar2= new MyJavaPractice();
   	System.out.println(myCar2);
   	 
   	 MyJavaPractice myCar3= new MyJavaPractice();
   	System.out.println(myCar3);
   	 
   	MyJavaPractice myCar4= new MyJavaPractice();
   	System.out.println(myCar4);*/
  
		
		
		myCar1.startCar();
		myCar1.startNavigation();
		myCar1.stopCar();
		
			
	}
	
	void startCar() {
		System.out.println("Car Started");
		
	}
	void startNavigation() {
		System.out.println("Navigation System Started");
		
	}
	void stopCar() {
		System.out.println("Car Stopped");
		
	}
}
