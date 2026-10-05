package skew;

	abstract class Atm01 {
	    abstract void withdraw();
	}

	abstract class Atm02 extends Atm01 {
	    abstract void deposit();
	}

	public class Solid extends Atm02 {

	    void withdraw() {
	        System.out.println("withdraw");
	    }

	    void deposit() {
	        System.out.println("Deposit");
	    }

	    public static void main(String[] args) {
	        Solid ss = new Solid();
	        ss.withdraw();
	        ss.deposit();
	    }
	}