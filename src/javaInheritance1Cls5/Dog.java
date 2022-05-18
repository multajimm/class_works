package javaInheritance1Cls5;

public class Dog extends Animal {
	
	//Attribute
	String eyeColor;
	
	//DEfault Constructor
	Dog(){
		System.out.println("Default Dog Object Contructor is created");
	}
	
	
	//Parameterized Constructor/explicit defined cons
	Dog(String eyeColor, String hairColor,int legs){
		System.out.println("Parameterized Dog Object Contructor is created");
		this.eyeColor=eyeColor; 
		super.hairColor=hairColor; //super= immediate parent class
		super.numberOfLeegs=legs;
		
		System.out.println("Dog Objected created with eyecolor:"+this.eyeColor);
		System.out.println("Dog Objected created with HaorColor:"+super.hairColor);
		System.out.println("Dog Objected created with NoOfLegs:"+super.numberOfLeegs);
	}
	
	public static void main(String[] args) {
		 Dog d=new Dog("Gray","Blue",3);
		 d.eat();
		 d.sleep();
		 d.sound();
		 
	}
	
	//behavior
		void sleep(){ 
			System.out.println("Dog Can Sleep");
		}
		
		void sound(){
			System.out.println("Dog Make Sound");
		}
		
		void eat(){
			System.out.println("DOg Can Eat");
		}
}
