package phan1;

public class Example3 {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 exm1 = new Example1();
		// exm1.prop1 = "Cập nhật chơi";
		// System.out.println(exm1.prop1);
		// exm1.prop2 = "Cập nhật chơi";
		// System.out.println(exm1.prop2);
		// exm1.prop3 = "Cập nhật chơi";
		// System.out.println(exm1.prop3);
		// System.out.println(Example1.prop4);
		Example3 exm3 = new Example3();
		System.out.println(exm3.sum(1,2));
		System.out.println(exm3.sum(1, 2, 3));
	}
}
