package ex3_getter_and_setter;

public class Student {
	// Tạo thuộc tính(property) cho Teacher
	public String name;
	public String code;
	public int birthday;
	
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
	
	public void getAllInfo () {
		System.out.println("name and code info student ");
		System.out.println(this.getName());
		System.out.println(this.getCode());
	}
}
