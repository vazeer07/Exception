package exception;

// we have 

public class Demo3 {
	public static void main(String[] args)  {
		String name="vazeer";
		int age=17;
		try {
		if(age>=18) {
			System.out.println("Welcome"+name);
		}
		else {
			throw new AgeException("you have not eligible");
			//throw new PriceException("you have not eligible");-----we are not able to Access

		}
		}
		catch(AgeException g) {
			System.out.println("Handle");
			
		}
		
		String gender="male";
		System.out.println(gender);
		
		
	}
	
}
