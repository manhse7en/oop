package phan2;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double calcArea() {
		return this.radius * this.radius * Math.PI;
	}

}
