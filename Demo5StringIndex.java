package exception;

public class Demo5StringIndex {

	public static void main(String[] args) {

		String a = "Hulk";
		
		try{System.out.print(a.charAt(5));
		
	}
		catch(StringIndexOutOfBoundsException e) {
		
			e.printStackTrace();
		}
		
		}

}
