package number;

public class twoseven {

	public static void main(String[] args) {
		System.out.println("start");
		   try {
			   int a = 10/2;
			   int[] ab=  {10,20,30};
			   System.out.println(ab[0]);
			   System.out.println(ab[1]);
			   System.out.println(ab[2]);
			   System.out.println(ab[3]);
			   
		   } catch (ArithmeticException e) {
			   System.out.println("Arithmatic handle"+e);
			   
		   }catch (ArrayIndexOutOfBoundsException e) {
			   System.out.println("Array Index"+e);
		   }
			// TODO Auto-generated method stub
	              System.out.println("end");
		}

	}

	