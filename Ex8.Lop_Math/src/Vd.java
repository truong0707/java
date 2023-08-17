import java.util.Scanner;

public class Vd {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao so a");
		a = sc.nextDouble();

		System.out.println("Nhap vao so b");
		b = sc.nextDouble();

		// ham tri tuyet doi
		System.out.println("|a|" + Math.abs(a));

		// ham tim min
		System.out.println("min(a,b)" + Math.min(a, b));

		// ham tim max
		System.out.println("max(a,b)" + Math.max(a, b));

		// ham tim ceil (lấy số nguyên lớn hơn hoặc bằng)
		System.out.println("ceil(a)" + Math.ceil(a));

		// ham tim floor(ấy số nguyên lớn nhỏ hoặc bằng)
		System.out.println("floor(a)" + Math.floor(a));

		// ham tim can bac 2
		System.out.println("sqrt(a)" + Math.sqrt(a));

		// ham tim a^b
		System.out.println("a^b(a)" + Math.pow(a, b));

	}
}
