package exception;

public class Demo4 {
	
	public static void main(String[] args) throws PriceException {
		
		String car = "Audi";
		int price =250000;
		
		if(price>350000) {
			System.out.print("This is "+car);
		}
		else {
			
			throw new PriceException("This is Not ");
		}
		
		System.out.print(" My fav Car");
		
	}

}
