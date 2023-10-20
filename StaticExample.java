package java8;

public class StaticExample {
	
	static int counter=0;
	
	public StaticExample() {
		counter++;
		System.out.println(counter);
	}
	
	static {
		System.out.println("This is static");
	}

}
