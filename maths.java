package shivani;
//OOPs
//inheritance
//polymorphism 1)method overloading 2)method overriding
//encapsulation
//Abstraction
public class maths {
	void add(String s)
	{
		System.out.println("method 1");
	}
	
	void add(int a, int b)
	{
		System.out.println("method 2");
	}
	
	public static void main(String[] args) {
		maths address = new maths();
		address.add("hello");
		address.add(1, 2);
   }

}
