package java8;
//Method Reference

public class Findmax {
	public static void main(String[] args) {
		
	
	
	Max m1 = new Max();
	
	MaxMin a = m1::findMax;
	
	int[]num= {10,20,30,40,50,100};
	System.out.println(a.find(num));
	
	//(--------------------------------------------------------------)
	
	MaxMin b = Max::findMin;
	System.out.println(b.find(num));

}
}
