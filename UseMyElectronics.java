package java8;

public class UseMyElectronics {
	public static void main(String[] args) {
		
		MyElectronics m1 = new MyElectronics();
		System.out.println(m1.status(false));
		m1.price(10000);
		System.out.println(Electronics.name());
		
	}

}
