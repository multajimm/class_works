package javaInheritance1Cls5;
	//superClass
public class Animal {
	//attributes
	int numberOfLeegs; 
	String hairColor;
	
	//Constructor
	Animal(){
		System.out.println("Animal Object Is Created");
	}
	
	//behavior
	void sleep(){ 
		System.out.println("Animal Can Sleep");
	}
	
	void sound(){
		System.out.println("Animal Make Sound");
	}
	
	void eat(){
		System.out.println("Animal Can Eat");
	}
	
}
