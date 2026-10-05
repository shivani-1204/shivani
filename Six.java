package two;

public class Six {

	int a ;
	int b ;

   void	add(int a , int b)
	{
	      this.a=a;
	      this.b=b;
	}
   void	add1()
   {
	   System.out.println("this is very good"+(a+b));
   }
	 public static void main(String[] args) {
			Six ff = new Six();
		   ff.add(2, 3);
		   ff.add1();
		}
	}