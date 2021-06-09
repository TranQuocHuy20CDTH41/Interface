package advance.dev;
import java.util.Scanner;

public class MainApp {
	static Shape[] input() {
		Shape[] shapes = new Shape[10];
		for(int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("--Nhap vao thong tin hinh tron--");
			System.out.println("Nhap ten hinh tron:");
			String ten = sc.next();
;			System.out.println("Nhap vao ban kinh: ");
			double bk = sc.nextDouble();
			Circle cir = new Circle(ten, bk);	
			shapes[i] = cir;
		}
		for(int i = 3; i < 6; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("--Nhap vao thong tin hinh chu nhat--");
			System.out.println("Nhap ten hinh chu nhat:");
			String ten = sc.next();			
			System.out.println("Nhap vao canh A: ");
			double cA = sc.nextDouble();
			System.out.println("Nhap vao canh B: ");
			double cB = sc.nextDouble();
			Rectangle rec = new Rectangle(ten, cA, cB);	
			shapes[i] = rec;
		}
		for(int i = 6; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("--Nhap vao thong tin hinh tam giac--");
			System.out.println("Nhap ten hinh tam giac:");
			String ten = sc.next();			
			System.out.println("Nhap vao canh A: ");
			double cA = sc.nextDouble();
			System.out.println("Nhap vao canh B: ");
			double cB = sc.nextDouble();
			System.out.println("Nhap vao canh C: ");
			double cC = sc.nextDouble();
			Triangle tri = new Triangle(ten, cA, cB, cC);	
			shapes[i] = tri;
		}		
		return shapes;
	}
	static void print(Shape[] shapes) {
		for (int i = 0; i < 10; i++) {
			System.out.println(shapes[i].toString());
		}
	}	
	public static void findMaxDienTich(Shape[] shapes) {
		Shape max = shapes[0];
		for (int i = 0; i < 10; i++) {
			Shape sha =  shapes[i];
			if(sha.dienTich() > max.dienTich()) {
				max = sha;
			}
		}	
		System.out.println("Hinh co dien tich lon nhat la: ");		
		System.out.println(String.format("Ten: %s, Dien tich: %f", max.name, max.dienTich()));		
	}
	public static void findMaxDienTichHinhTron(Shape[] shapes) {
		Circle max = (Circle) shapes[0];
		for (int i = 0; i < 3; i++) {
			Circle cir = (Circle) shapes[i];
			if(cir.dienTich()> max.dienTich()) {
				max = cir;
			}
		}
		System.out.println("Hinh tron co dien tich lon nhat la: ");		
		System.out.println(String.format("Ten: %s, Dien tich: %f", max.name, max.dienTich()));		
	}
	public static void findMaxDienTichHinhChuNhat(Shape[] shapes) {
		Rectangle max = (Rectangle) shapes[3];
		for (int i = 3; i < 6; i++) {
			Rectangle rec = (Rectangle) shapes[i];
			if(rec.dienTich()> max.dienTich()) {
				max = rec;
			}
		}
		System.out.println("Hinh chu nhat co dien tich lon nhat la: ");		
		System.out.println(String.format("Ten: %s, Dien tich: %f", max.name, max.dienTich()));		
	}
	public static void findMaxDienTichHinhTamGiac(Shape[] shapes) {
		Triangle max = (Triangle) shapes[6];
		for (int i = 6; i < 10; i++) {
			Triangle tri = (Triangle) shapes[i];
			if(tri.dienTich()> max.dienTich()) {
				max = tri;
			}
		}
		System.out.println("Hinh tam giac co dien tich lon nhat la: ");		
		System.out.println(String.format("Ten: %s, Dien tich: %f", max.name, max.dienTich()));		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[10];
		shapes = input();
		print(shapes);
		findMaxDienTich(shapes);
		findMaxDienTichHinhTron(shapes);
		findMaxDienTichHinhChuNhat(shapes);
		findMaxDienTichHinhTamGiac(shapes);
	}

}