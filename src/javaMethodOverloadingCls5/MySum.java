package javaMethodOverloadingCls5;

public class MySum {

	public static void main(String[] args) {
		MySum m= new MySum();
		//Compile time Polymorphism/Method Overloading
		//method calling-- we will call the methods down now..
		System.out.println(m.sum());
		
		System.out.println(m.sum(2, 3));
		
		System.out.println(m.sum(3, 4, 5.23f));
	}
	 int sum(){
		 return(1+2);
	 }
	 int sum(int a, int b){
		 return(a+b);
	 }
	 
	 float  sum(int a, int b,float c){
		 return(a+b+c);
	 }
	 
}
