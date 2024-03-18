package superoverloading;

public class SuperConstructorChild extends SuperConstructor {
	SuperConstructorChild()
	{
		
		//super();
		System.out.println("morning");
	}

	public static void main(String[] args) {
		
		SuperConstructorChild obj=new SuperConstructorChild();
	}

}
