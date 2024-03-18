package superoverloading;

public class SuperMethodChild extends SuperMethod {
	public void display()
	{
	System.out.println("Hi");	
	super.display();	
	}

	public static void main(String[] args) {
	
		SuperMethodChild obj=new SuperMethodChild ();
		obj.display();

	}

}
