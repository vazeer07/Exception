package java8;

public class MyElectronics implements Electronics {
	
	public String status(boolean a) {
		
		if(a==true) {
			return "its working";
		}
		else {
			return "its not working";
		}
	}
	
	public void price(int ab) {
		System.out.println(ab+100);
	}

}
