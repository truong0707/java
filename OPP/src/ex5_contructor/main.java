package ex5_contructor;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tạo  đối tượng theo khuôn Student
		Student student1 = new Student("Truong", "48268", 2001);
		student1.setCodeAndName("Truong", "49269");
		
		
		// get name and code student
		student1.getAllInfo();
		

	}
}


