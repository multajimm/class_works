package javaAbstraction1Cls5;

public interface Interface1Cls7 {
	//public/static/final===called identifier
	// cannot have any implementation in a interface. like method, main method
	//we cannot create an Object of an Interface
	// To ilplement we need to create another class
	
	int myData=10;
	boolean mySumMethod();
	void helloWorld();
	
	static void myMethod(){
		System.out.println("Static method from interface_1");
	}
	
}
