package day1;

public class Main {
	
	    public static void main(String[] args) {
	        int rows = 5; // Change this number to make the triangle bigger or smaller

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); // Moves to the next line
	        }
	    }
}
	
public class Main {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // 1. Prints spaces to push stars to the right side
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // 2. Prints the stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // 3. Moves to the next line
            System.out.println();
        }
    }
}