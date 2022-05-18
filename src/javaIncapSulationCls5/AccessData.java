package javaIncapSulationCls5;

public class AccessData {

	public static void main(String[] args) {
		
		
		JavaEncalSulation e= new JavaEncalSulation(); //Has a relationship
		
		e.setFirstName("Hello");
		e.setLastName("World");
		
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getMySSn());
		
	}

}
