package java8;


import java.util.Optional;

public class Sample {
	public static void main(String[] args) {
		
		String a =null;
		
		//<String>check=Optional.of(a);
		Optional<String>check=Optional.ofNullable(a);
		//System.out.println(check);

//		if(check.isPresent()) {
//			System.out.println(a.toUpperCase());
//		}
//		else {
//			System.out.println("The value Is Empty");
//		}
//		
		System.out.println(check.isEmpty());
		System.out.println(check.isPresent());

		
		

		
		
		
	}

}
