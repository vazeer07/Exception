package exception;

public class Dmo {
	public static void main(String[] args) {
		System.out.println("hiii");
		int a=10;
		int c=0;
		try{
			System.out.println(a/c);
		}
		catch(Exception e) {
		System.out.println("Don't divide by 0");
	    System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Bye..");
	}
}
