package com.telentech;

public class JavaMethodPracticeC3 {

	public static void main(String[] args) {
		JavaMethodPracticeC3 agent=new JavaMethodPracticeC3();
		agent.myMethod();
		agent.sumMethod();
		System.out.println(agent.floatMethod());
		int sum=agent.sumMethod()+100;
		System.out.println(sum);
		System.out.println(agent.sum(100, 50));
		
	}
	void myMethod(){ //void is return type
		System.out.println("This is my method returning VOID");
	}
	int sumMethod(){
		int a=10;
		int b=5;
		int c=a+b;
		return c;
	}
	float floatMethod(){
		return 10.03f;
	}
	//parameterize method
	int sum(int a, int b){
		int c=a+b;
		return c;
	}
}
