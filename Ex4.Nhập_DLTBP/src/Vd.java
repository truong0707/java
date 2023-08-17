import java.util.Scanner;

public class Vd {
	public static void main(String[] args) {
		// dùng scanner để nhập đữ liệu từ  (có sẵn)
		
		Scanner sc = new Scanner(System.in); // System.in là dữ liệu từ bàn phím
		System.out.println("Hay nhap ten cua ban: ");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Hay nhap ma SV: ");
		long maSv = sc.nextLong();
		
		System.out.println("Hay nhap ma SV: ");
		float diemThi = sc.nextLong();	
		
		System.out.println("--------");
		System.out.println("Ten : " + hoVaTen);
		System.out.println("masv : " + maSv);
		System.out.println("diem thi : " + diemThi);
	}
}