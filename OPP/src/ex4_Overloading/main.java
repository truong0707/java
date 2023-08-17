package ex4_Overloading;

public class main {
	// Property (thuộc tính) - Là đặc điểm, đặc tính của 1 phương thức
	// Method (phương thức) - Là các hành động có thể được thực hiện từ lớp, phương 
	// thức cũng giống như hàm nhưng là hàm riêng của lớp
	
	// Ví dụ: Đối tượng "Sinh viên Trường"
	// Đặc điểm : Tóc 7/3, mặt to, lông mày đậm, cao 1m8 --> Thuộc tính
	// Hành động : Viết code, ngủ, ăn, chơi game --> Phương thức 
	
	
	// overloading - Overloading là một kĩ thuật cho phép trong cùng một class có 
	// thể có nhiều phương thức cùng tên nhưng khác nhau về số lượng tham số hoặc 
	// kiểu dữ liệu tham số.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tạo  đối tượng theo khuôn Student
		Student student1 = new Student();
		student1.setCodeAndName("Truong", "49269");
		
		
		// get name and code student
		student1.getAllInfo();
		

	}
}


