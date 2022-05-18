package javaAbstraction1Cls5;

abstract  public class javaAbstraction1Cls5 {
	
	/*	
	 * abstracytion- no metter what happening inside/coding.
	 * inly thing care about just use the code.Dont worry about coding...just use it
	 * cannot create object
	 * Abstract method cannot be implemented
	 */
	//int a=10;
	//int b=15;
	int myData;
	
	
	
	javaAbstraction1Cls5(){
		System.out.println("javaAbstraction1Cls5 Constructor");
		this.myData=143;
		
	}
	
	 abstract int sum(int a, int b);
	 abstract void myMethod();	// does not have  a method body for abstract class
	void myAnotherMethod(){
		System.out.println("Regular method");
	}
	
	
}
