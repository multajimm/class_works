package JavaAccessModifier1Class4;

public class ClassA {
	int myPublicData=10;
	protected int myProtectedData=20;
	int myDefaultData=30;
	private int myPrivateData=40;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA c=new ClassA();
		System.out.println(c.myPublicData);
		c.myMethodA();
		c.myProMethod();
		c.myDefaultMethod();
		c.myPrivate();

	}
	public  void myMethodA(){
		System.out.println("This is  myMethodA from ClassA ");
	}
	
	protected void myProMethod(){
		System.out.println("Protected method");
	}
	
	void myDefaultMethod(){
		System.out.println("myDEfaultMethod from Class A");
	}
	
	private void myPrivate(){
		System.out.println("myPrivate from Class A");
	}
}
