package oppsconcept2;

public class TestCar2 {

	public static void main(String[] args) {
		/*static or compile polymorphism-
		when child class object with the child class object referance variable
		its call static or compile time polymorphism
		*/
		ToyotaClass a=new ToyotaClass();
		a.start();
		a.stop();
		a.refuel();
		a.theafsafety();
		System.out.println("=================");
		/*Dynamic or Run time or Top casting polymorphism-
		when child class object with the Parent class object referance variable
		its call Dynamic  or run time polymorphism
		*/
		Carclass1 b=new ToyotaClass();
		b.start();
		b.stop();
		b.refuel();
		System.out.println("============");
		/* Down castin-when parent class object with the child class 
		object referance its call down casting but its not allowed
		but when you casting into the child class it will allow,
		but you will get one exception "classCastException"
		*/
		ToyotaClass c=(ToyotaClass) new Carclass1();
		c.start();
		c.stop();
		c.refuel();
		c.theafsafety();
		
		


	}

}
