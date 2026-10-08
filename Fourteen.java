package number;
//interface
	interface Kite {
		void m1();
	}

	class Fourteen implements Kite {

		public void m1() {
			System.out.println("Hello");

		}

		public static void main(String[] args) {
			Fourteen bb = new Fourteen();
			bb.m1();
		}

	}