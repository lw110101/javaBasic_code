package single;

class Student{
	
	String name;
	
	private static Student s;
	
	public Student() {}

	public static Student getInstence() {
		if (s == null) {
			synchronized ("��") {
				if (s == null) {
					s = new Student();
				}
			}
		}
		return s;
	}	
}

public class Demo1 {

	public static void main(String[] args) {
		
	}
}
