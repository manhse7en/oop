package phan1;

public class Example2 extends Example1 {
	public Example2() {
		super(); // thừa kế hàm khởi tạo không tham số
		String test = super.test();
		System.out.println("Hàm khởi tạo Example2");
		System.out.println(super.prop2);
		System.out.println(test);
	}
	
	public String override() {
		return "thằng con";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 exm2 = new Example2();
		// exm2.prop1 = "Cập nhật chơi";
		// System.out.println(exm2.prop1);
		// exm2.prop2 = "Cập nhật chơi";
		// System.out.println(exm2.prop2);
		// System.out.println(exm2.getProp1());
		System.out.println(exm2.override());
	}
}
