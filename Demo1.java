package exception;

public class Demo1 {
	public static void main(String[] args) {
		
		String a = "Demo";
		//char[] b =a.toCharArray();
		
		int[] c = {10,20,30};
		
		try{System.out.print(a.charAt(5));
		
	}
		catch(Exception f) {
		
			System.out.println("Can't print the char value");
			System.out.println(f);
			//f.printStackTrace();
		}
		
		try{System.out.print(c[5]);
		}
		catch(Exception g) {
		
			System.out.println("dont't print int value");
			System.out.print(g);
			//g.printStackTrace();
		}
		}

}
