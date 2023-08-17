import java.util.Scanner;

public class Vd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhâp so");
		int a = sc.nextInt();
		
		String ketQua = (a % 2 == 0) ? "So chan" : "so le";
		System.out.println("ket qua là: " + ketQua);
 	}
}
