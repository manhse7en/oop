package phan1;

public class Example1 {

	private String prop1 = "Chỉ duy nhất bản thân lớp được truy cập";
	protected String prop2 = "Bản thân nó và lớp con của nó được truy cập";
	public String prop3 = "Công khai";
	static String prop4 = "Biến tĩnh không cần khởi tạo giá trị vẫn truy cập được";

	public Example1() {
		System.out.println("Hàm khởi tạo Example1");
	}

	public Example1(String prop1, String prop2, String prop3) {
		this.prop1 = prop1;
		this.prop2 = prop2;
		this.prop3 = prop3;
	}

	public String getProp1() {
		return prop1;
	}

	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}

	public String getProp2() {
		return prop2;
	}

	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}

	@Override
	public String toString() {
		return "Example1 [prop1=" + prop1 + ", prop2=" + prop2 + ", prop3=" + prop3 + "]";
	}

	protected String test() {
		return "test ahihi";
	}
	
	protected String override() {
		return "thằng cha";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}