package hierarchy;

public class Cat extends Animal {
public void display1()
{
	
	System.out.println("Good");
}
	public static void main(String[] args) {
	
Cat obj=new Cat();
obj.display1();
obj.show();
Dog obj1=new Dog();
obj1.sample();
	}

}
