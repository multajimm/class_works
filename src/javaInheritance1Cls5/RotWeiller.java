package javaInheritance1Cls5;

public class RotWeiller extends Dog{
	//Default Constructor
	int myInt=13;
	RotWeiller(){
		System.out.println(" RotWeiller Dog Object Contructor is created");
		//By DEfault attribute. 
		super.eyeColor="Green";
		super.hairColor="Red";
		super.numberOfLeegs=4;
	}
	
	RotWeiller(String eyeColor, String hairColor,int legs){
		System.out.println("Parameterized Dog Object Contructor is created");
		super.eyeColor=eyeColor; 
		super.hairColor=hairColor; //super= immediate parent class
		super.numberOfLeegs=legs;
		
		System.out.println("Dog Objected created with eyecolor:"+super.eyeColor);
		System.out.println("Dog Objected created with HaorColor:"+super.hairColor);
		System.out.println("Dog Objected created with NoOfLegs:"+super.numberOfLeegs);
	}
		
	
	public static void main(String[] args) {
		/*RotWeiller r1=new RotWeiller(); //r1= reference variable
		RotWeiller r2=new RotWeiller("Yellow","White",4); //parameterized object
		
		r2.sleep();
		r2.eat();
		r2.sound();*/
		
		//Upcasting Object
		Animal a1= new RotWeiller(); //putting on .....animal type reference variable = Rotwiller object created
		Animal a2= new RotWeiller("Yellow","White",4);
		a2.numberOfLeegs=5;
		a2.hairColor="Grey";
		//a2.eye
		//a2.myInt
		a2.sleep();
		//a2.bite();
		a1= new Dog();
		
		
		/*Dog dd=new RotWeiller();
		dd.numberOfLeegs=5;
		dd.eyeColor="White";
		dd.hairColor="Red";*/
		
	}
	
	void sleep(){
		System.out.println("Rottwille dreams about scary movies");
	}
	
	void bite(){
		System.out.println("Rottwille Can Bite");
	}
}
