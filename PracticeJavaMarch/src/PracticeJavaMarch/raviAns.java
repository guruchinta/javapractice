package PracticeJavaMarch;

public class raviAns {

}


abstract class RaviA{
	
	int number=0;
	void increment( int num) {
		this.number += num;
	}
	int GetMethod() {
		return this.number;
	}
}

class RaviB extends RaviA{
	void increment() {
		this.number+= 2;
	}
}