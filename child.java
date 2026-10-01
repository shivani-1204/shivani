package shivani;
class Same
{
	void property()
	{
		System.out.println("property");
	}
	void marry()
	{
		System.out.println("fam selec");
	}
}

public class child extends Same {
	void marry()
	{
		System.out.println("campus selec");
	}

	public static void main(String[] args) {
		child ss = new child();
		ss.marry();
		ss.property();

	}

}
