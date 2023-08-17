package ex2_Property_and_Method;

public class main {
	// Property (thuộc tính) - Là đặc điểm, đặc tính của 1 phương thức
	// Method (phương thức) - Là các hành động có thể được thực hiện từ lớp, phương 
	// thức cũng giống như hàm nhưng là hàm riêng của lớp
	
	// Ví dụ: Đối tượng "Sinh viên Trường"
	// Đặc điểm : Tóc 7/3, mặt to, lông mày đậm, cao 1m8 --> Thuộc tính
	// Hành động : Viết code, ngủ, ăn, chơi game --> Phương thức 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tạo  đối tượng theo ojb Student
		Student student1 = new Student();
		student1.name = "Truong";
		
		Student student2 = new Student();
		student2.name = "Huong";
		
		System.out.println(student1.name + ": student1"); // in ra tên của đối tượng Student 1
		System.out.println(student2.name + ": student2"); // in ra tên của đối tượng Student 2
	}
}
// ==> Khi làm việc, ta k sử dụng cách này để chỉnh sử cũng như truy cập vào đối tượng
// mà ta sẽ sử dụng getter và setter


