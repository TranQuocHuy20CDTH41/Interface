package advance.dev;

public class Circle extends Shape {
	double banKinh;
	public Circle(String name, double banKinh) {
		super();
		this.name = name;
		this.banKinh = banKinh;
	}
	
	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * banKinh;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * banKinh * banKinh;
	}
	@Override
	public String toString() {
		return String.format("Ten: %s, Ban kinh la: %f, Chu vi la: %f, Dien tich la: %f", name, banKinh, chuVi(), dienTich());
	}
}
