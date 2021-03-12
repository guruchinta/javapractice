package PracticeJavaMarch;
public class primary implements InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Helo Guru");
		System.out.println(color);
		System.out.println("Everythign works fine");
		primary pm = new primary();
		pm.fillUp();
		
		
	}

	@Override
	public void fillUp() {
		System.out.println("Its  Okay Main ");
	}

}


interface InterfaceExample{
	String color = "blue";
	void fillUp();
	
}