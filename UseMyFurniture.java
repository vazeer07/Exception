package java8;

public class UseMyFurniture {
public static void main(String[] args) {
	
	MyFurniture my = new MyFurniture();
	System.out.println(my.findMileage("sports bike"));
	System.out.println(my.findCc(250));
	
	Furniture.findSpeed("Sports bike");

}
}
