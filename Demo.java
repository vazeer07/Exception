package exception;

public class Demo {
	public static void main(String[] args) {
		String ab=null;
		try{
			System.out.println(ab.toUpperCase());
					}
		catch(Exception d) {
			//System.out.print("Don't Change UpperCase()");
			///System.out.print(d);
			d.printStackTrace();
		}
	}
}
