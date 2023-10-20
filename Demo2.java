package exception;

public class Demo2 {
	public static void main(String[] args) {
		
		String a ="salam123";
		try{int b = Integer.parseInt(a);
		
		System.out.print(b);
		}
		catch(Exception z) {
			System.out.println(z);
		}
		
		finally {
			System.out.println("Ok run Program");
		}
		
		System.out.print("HELoo");
	}
	

}
