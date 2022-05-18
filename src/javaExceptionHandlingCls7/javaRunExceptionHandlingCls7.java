package javaExceptionHandlingCls7;

import java.util.Scanner;

public class javaRunExceptionHandlingCls7 {
	
	//compile time/checked exception
	//runtime/unchecked exception
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Print the first number");
	int a=sc.nextInt();
	System.out.println("\nPrint the second number");
	int b=sc.nextInt();
	
	try{
	System.out.println(a/b);
	int []arr=new int[3];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	}catch(ArithmeticException e){
		System.out.println("next time put integer number but not zero");
		//e.printStackTrace();
		//System.out.println(e.fillInStackTrace());
		//e.fillInStackTrace();
		System.out.println(e.getMessage());
		
	}
	sc.close();
	
	System.out.println("Executed");
	
	try{
	int []arr=new int[3];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	}catch(ArrayIndexOutOfBoundsException e){
		
	}catch(Exception e){
		System.out.println("Exception Hndled");
	}
	for(int i=0; i<3;i++){
		System.out.println("Hello World");
	}
	
	
	
	
}
}
