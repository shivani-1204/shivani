package shivani;

class Parent {
	void property()
	{
		System.out.println("Property");
	}
	void marry() 
	{
		System.out.println("famaily selection");
	}
}

public class demo extends Parent {
	void marry() 
	{
		System.out.println(" campus selection");
	}
	public static void main(String[] args) {
		demo bb = new demo();
    bb.marry();
    bb.property();
    
	}
}


