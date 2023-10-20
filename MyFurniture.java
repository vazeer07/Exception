package java8;

public class MyFurniture implements Furniture {
	
	public int findMileage(String a) {
		if(a.equals("Sports Bike")) {
			return 15;
		}
		else {
			return 40;
		}
	}
	
	public String findCc(int cc) {
		if(cc>150) {
			return "Super Sports bike";
		}
		else {
			return "Normal bike";
		}
	}

}
