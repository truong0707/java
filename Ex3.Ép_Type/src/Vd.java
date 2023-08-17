
public class Vd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 2;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
        // Ép kiểu ngầm định
		float c = a;
		float d = b;
		
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		// Ép kiểu tường minh
		float e = 3.5f;
		float f = 9.5f;
		
		int g = (int) e;
		int h = (int) f;
		
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
		// Ép kiêủ giữa biến nguyên thuỷ và đối tượng
		int x = new Integer(30);
		System.out.println("x = " + x);
		
	}
}
