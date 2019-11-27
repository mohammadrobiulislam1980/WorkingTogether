package oppsconcept2;

public class StaticNonStaticMethod2 {
	String name="Shazid";
	static int age=11;

	public static void main(String[] args) {
		//1. Call Direct
		sum();
		System.out.println(age);
		//by class
		StaticNonStaticMethod2.sum();
		System.out.println(StaticNonStaticMethod2.age);
		//by Creating object
		StaticNonStaticMethod2 ab=new StaticNonStaticMethod2();
		//Non static method
		System.out.println(ab.name);
		ab.mail();
		//static method
		System.out.println(ab.age);
		ab.sum();
	}
	public static void sum() {
		System.out.println("Total number");
	}
	public void mail() {
		System.out.println("He should receive mail");
	}

}
