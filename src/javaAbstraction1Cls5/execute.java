package javaAbstraction1Cls5;

public class execute extends javaAbstraction1Cls5  {

	

	public static void main(String[]args){
		execute obj= new execute();
		
		System.out.println(obj.sum(10, 15));
		obj.myMethod();
		obj.myAnotherMethod();
	}
	
	
	int sum(int a, int b){
		int c=a+b;
		return c;	
	}
	
	void myMethod(){
		System.out.println("Empty method");
	}
	
}
