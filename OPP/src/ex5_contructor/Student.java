package ex5_contructor;

public class Student {
	// thuộc tính(property) cho Teacher
	public String name;
	public String code;
	public int birthday;
	
	// sử dụng Contructor để tạo ra các thuộc tính 
	public Student(String name, String code, int birthday) {
		this.name = name;
		this.code = code;
		this.birthday = birthday;
	}
	
	
	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}
	
	public String getCode () {
		return code;
	}
	
	public void setCode (String code) {
		this.code = code;
	}
	
	// 
	public void setCodeAndName (String name, String code) {
		this.name = name;
		this.code = code;
	}
	
	public void setCodeAndName () {
		System.out.println("ssss");
	}
	
	public void getAllInfo () {
		System.out.println("name and code info student ");
		System.out.println(this.getName());
		System.out.println(this.getCode());
	}
}
