package number;
//encapsulation

 class Parent
{
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
public class Eleven extends Parent
{
	public static void main(String[] args) {
		Eleven bb = new Eleven();		
   bb.setA(8);
 int ss=  bb.getA();
 System.out.println(ss);
	
}
	


	