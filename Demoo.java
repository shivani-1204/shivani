package shivani;

class Diff {
	void peoprty() {
		System.out.println("Property");
	}
	void marry() {
		System.out.println("famaily selection");
	}
}
public class Demoo extends Diff {
	void marry() {
		System.out.println(" campus selection");
	}
	public static void main(String[] args) {
		Demoo bb = new Demoo();
    bb.marry();
    bb.peoprty();
    
	}
}