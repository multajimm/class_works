package javaAbstraction1Cls5;


	//Class cannot extend from interface
	//we have to use implements keyword

public class MyClassInterface1Cls7 implements Interface1Cls7, Interface2Cls7{
	
	
	public static void main(String[] args) {
		MyClassInterface1Cls7  m= new MyClassInterface1Cls7 ();
		System.out.println(Interface2Cls7.myData);
		System.out.println(m.mySumMethod());
		//System.out.println(m.helloWorld());
	}
	public boolean mySumMethod(){
		return true;
	};
	
	public boolean mySumMethod(int a, int b){
		return true;
	};
	
	
	public void helloWorld(){
		
	};
}
