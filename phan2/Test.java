package phan2;

public class Test {

	public Shape s1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.s1 = new Circle(3.5);
		System.out.println(test.s1.calcArea());
//		test.s1 = new Rectangle(3,4);
//		System.out.println(test.s1.calcArea());
	}

}
