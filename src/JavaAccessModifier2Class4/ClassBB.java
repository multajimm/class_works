package JavaAccessModifier2Class4;

import JavaAccessModifier1Class4.ClassA;

public class ClassBB  extends ClassA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA c=new ClassA();
		ClassBB x=new ClassBB();
		c.myMethodA();
		x.myProMethod();
		//c.myDefaultMethod();
		//myPrivate();
	}
}
