package test.abstracts;

public abstract class People {
	int age;
	String name;
	
	
	public People(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	abstract void print();
	
	protected void countAge(){
		age = age*2;
	}
}
