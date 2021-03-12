package PracticeJavaMarch;

abstract class Dog{
	int dogCount=0;
	void increment() {
		this.dogCount ++;
	}
	void decrement() {
		this.dogCount--;
	}
	int getCount() {
		return this.dogCount;
	}
}

class Animal extends Dog{
	
}
public class recursion {
	void DogMethod(){
		Animal am = new Animal();
		am.increment();
		am.increment();
		System.out.println(" Dog Count " +am.getCount());
		am.decrement();
		System.out.println(" Dog Count " +am.getCount());
	}
	

}
