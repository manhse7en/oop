package phan2;

public class MiniCar implements Car, Vehicle{
	private String model;
	private String hashWheels;
	
	@Override
	public void setHashWheels(String bool) {
		this.hashWheels = bool;
	}
	
	@Override
	public String getHashWheels() {
		return this.hashWheels;
	}
	
	@Override
	public void setModel(String name) {
		this.model = name;	
	}
	
	@Override
	public String getModel() {
		return this.model;
	}

}
