package superoverloading;

public class ChildOverloading extends ParentOverloading{
	String a="Morning";
	public void display()
	{

		System.out.println(a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		ChildOverloading obj=new ChildOverloading();
		obj.display();

	}

}
