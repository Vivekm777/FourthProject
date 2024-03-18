package polymorphism;

public class MethodOverloaingProgramme {
public void show()
{
	System.out.println("hi");
}
public void show(int a)
{
	System.out.println(a);
}
	public static void main(String[] args) {
		
		MethodOverloaingProgramme obj=new MethodOverloaingProgramme();
		obj.show();
		obj.show(5);
	}

}
