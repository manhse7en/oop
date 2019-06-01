package phan2;

public class Test2 {
	public static void main(String[] args) {
		Car c1 = new MiniCar();
		Vehicle v1 = new MiniCar();
		c1.setModel("car1");
		System.out.println(c1.getModel());
		v1.setHashWheels("3banh");
		System.out.println(v1.getHashWheels());
	}
}
