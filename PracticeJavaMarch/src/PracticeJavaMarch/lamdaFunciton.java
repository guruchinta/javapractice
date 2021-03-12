package PracticeJavaMarch;

import java.util.ArrayList;
import java.util.function.Consumer;
public class lamdaFunciton {
	void retrieveMethod() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(7);
		Consumer<Integer> cn = (number)->{System.out.println("It Prints "+ (number+1) );};
		al.forEach(cn);
		
	}
}
