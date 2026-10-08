package number;

public class Student {
	String name;
	int age;
	
	void introduction() 
	{
		System.out.println("I am "+ name + age + "age");
	}
	 public static void main(String[] args) {
	Student ss = new Student();
	ss.name = "usha";
	ss.age = 12;
	ss.introduction();
 }
}