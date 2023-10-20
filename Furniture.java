package java8;

public interface Furniture {
	
	public int findMileage(String a);
	
	public static void findSpeed(String a) {
		if(a.equals("Sports bike")) {
			System.out.print("Above 150km/hr");
		}
		else {
			System.out.println("Below 150km/hr");
		}
	}
	
	public default String findCc(int cc) {
		if(cc>150) {
			return "Sports bike";
		}
		else {
			return "Normal bike";
		}
	}

}
