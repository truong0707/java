import java.util.Scanner;

public class Vd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so nguyen tu 0 - 8");
		n = sc.nextInt();
		
		switch (n) {
		case 2: {
			System.out.println("Hom nay la thu 2");
			break;
		}
		
		case 3: {
			System.out.println("Hom nay la thu 3");
			break;
		}
		
		default:
			System.out.println("Cac thu con lai");
		}
	}

}
