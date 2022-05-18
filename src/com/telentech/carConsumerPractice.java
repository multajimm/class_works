package com.telentech;

public class carConsumerPractice {
		int steering=1;
	public static void main(String[] args) {
		MySuperCarPractice myAgent= new MySuperCarPractice();
		carConsumerPractice myAgent1= new carConsumerPractice();
		System.out.println("Number of Wheels="+myAgent.wheels);
		System.out.println("Number of Mirrors="+myAgent.mirrors);
		myAgent.carStart();
		myAgent.stopCar();
	}
}
