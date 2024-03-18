package polymorphism;

public class MethodOverridingChild extends MethodOverRiding {
	public void show()
	{
		System.out.println("Hi");
		
	}

	public static void main(String[] args) {
		 MethodOverridingChild obj=new  MethodOverridingChild();
		 obj.show();

	}

}
