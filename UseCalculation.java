package java8;

//FunctionalInterface

public class UseCalculation {
	public static void main(String[] args) {
		
		Calculation add = (x,y)->x+y;
		System.out.print(add.find(10, 40));
		
	}

}
