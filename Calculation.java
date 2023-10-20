package java8;

@FunctionalInterface

public interface Calculation {
	
	public int find(int a, int b);
	
	public static String name() {
		return "Mubeena";
	}
	
	public default void progrees() {
		
		System.out.println("Arithematic Expression");
	}

}
