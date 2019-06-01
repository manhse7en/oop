package phan2;

public class ChildTest extends Test {
	
	public ChildTest() {
		super();
	}
	
	public static void main(String[] args) {
		ChildTest child = new ChildTest();
		System.out.println(child.s1.calcArea());
	}
	
}
