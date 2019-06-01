package phan2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle(3.5);
		System.out.println(s1.calcArea());
		Shape s2 = new Rectangle(3,4);
		System.out.println(s2.calcArea());
	}

}
