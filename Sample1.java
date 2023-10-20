package java8;

import java.util.Optional;

public class Sample1 {
	public static void main(String[] args) {
		
		String ab = "null";
		
		Optional<String>name=Optional.ofNullable(ab);
		//System.out.println(name.get());
		//System.out.println(name.orElse("This is Nothing"));
		System.out.println(name.orElseThrow(()->new NullPointerException()));
		
	}

}
