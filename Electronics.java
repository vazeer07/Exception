package java8;

public interface Electronics {

	public String status(boolean a);
	
	public static String name() {
		return "Mobile";
	}
	
	public default void price(int ab) {
		System.out.println(ab);
	}
}
