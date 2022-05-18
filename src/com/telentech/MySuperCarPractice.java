package com.telentech;

public class MySuperCarPractice {
	int wheels=4;
	final int mirrors=2;   //
	
	public static void main(String[] args) {                //
		MySuperCarPractice myAgent= new MySuperCarPractice();
		carConsumerPractice myAgent1= new carConsumerPractice();
		System.out.println(myAgent);
		System.out.println("Total NUmber of Wheels="+myAgent.wheels);
		System.out.println("Total NUmber of Mirrors="+myAgent.mirrors);
		myAgent.wheels=6;
		System.out.println("Total NUmber of Wheels="+myAgent.wheels);
		System.out.println("Total NUmber of steering="+myAgent1.steering);
		myAgent.carStart();
		myAgent.stopCar();
	}
	void carStart(){
		System.out.println("Car Started");
	}
	void stopCar(){
		System.out.println("Car Stopped");
	}
}