import java.util.Scanner;

public class Vd {
	public static void main(String[] args) {
		// Phep cong và phep tru
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap a: ");
		a = sc.nextInt(); // ham để nhập vào 1 số nguyen

		System.out.println("Nhap b:");
		b = sc.nextInt(); // ham để nhập vào 1 số nguyen

		int tong = a + b;
		System.out.println("Tong cua " + a + " va " + b + " la: " + tong);

		// Phep nhan
		int nhan = a * b;
		System.out.println("Nhan cua " + a + " va " + b + " la: " + nhan);

		// Phep chia 
		int thuong = a / b; // o day thuc hien chia 2 so thuc cho nen kq se luon la so nguyen (1, 2, 3, 4, 5, 6, -1, -2, 3)
		System.out.println("Thuong cua " + a + " va " + b + " la: " + thuong);
		
		float thuong2 = (float)a / b; // ep kieu so thuc(1.2; 1.5; 5.1, -1.8)
		System.out.println("Thuong cua  " + a + " va " + b + " vi du 2 la: " + thuong2);

		// chia lay du
		int sodu = a % b;
		System.out.println("so du cua " + a + " va " + b + " la: " + sodu);
	}
}
