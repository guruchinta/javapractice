package PracticeJavaMarch;
interface InterfaceExample{
	String color = "blue";
	void fillUp();
	
}
public class primary implements InterfaceExample {

	public static void main(String[] args) {
		
		lamdaFunciton lf = new lamdaFunciton();
		lf.retrieveMethod();
		
		// TODO Auto-generated method stub
//		System.out.println("Helo Guru");
//		System.out.println(color);

//		primary pm = new primary();
//		pm.fillUp();
//		
//		recursion r =new recursion();
//		r.DogMethod();
		
//		RaviB rb = new RaviB();
//		rb.increment(3);
//		rb.increment();
//		System.out.println(rb.GetMethod());
		
		
	}

	@Override
	public void fillUp() {
		System.out.println("Its  Okay Main ");
	}

}

