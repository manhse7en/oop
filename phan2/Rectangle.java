package phan2;

public class Rectangle implements Shape {
	private float width;
	private float height;

	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double calcArea() {
		return this.width * this.height;
	}
}
