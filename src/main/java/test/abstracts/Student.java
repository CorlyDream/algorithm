package test.abstracts;

public class Student extends People{

	public Student(int age, String name) {
		super(age, name);
	}

	@Override
	void print() {
		System.out.println(name+":"+age);
	}

}
