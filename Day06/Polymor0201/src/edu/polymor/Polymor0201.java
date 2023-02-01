package edu.polymor;

abstract class Mammal {
	
	abstract public void moving();
	public Mammal() {
		System.out.println("난 Mammal기본생성자");
	}
	public void talk() {
		
	}
	public void show() {
		System.out.println("난 Mammal의 show()");
	}
	
}

class Person extends Mammal {
	
	
	protected final int IQ = 140;
	protected String name = null;
	protected int age = 0;
	static int blood = 'A';
	
	public static void display() {
		System.out.printf("blood=%c\n", blood);
//		System.out.printf("display()메서드안 name=%s\n", name);//error 
		
	}
	
	//기본생성자(default Constructor)..매개변수가 없음
	public Person()
	{
		System.out.println("난 Person의 기본생성자");
		name = null;
		age = 0;
	}
	public Person(String name, int age)
	{	
		super(); //Mammal();
		System.out.println("난 매개변수 두개인 Person생성자");
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {		
		this.name = name ; 
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return this.age;
	}
		
	public	void talk() 
	{	//name = "아무개";
		System.out.println("talk()메서드이다.");}
	
	public void talk(String shouting) {
		System.out.printf("shouting = %s\n", shouting);
		
	}
	
	public void talk(String shouting, int page) {
		System.out.printf("shouting = %s\n", shouting);
		System.out.printf("page=%d\n", page);
	}
	
	public void talk(int page, String shouting) {
		System.out.printf("shouting = %s\n", shouting);
		System.out.printf("page=%d\n", page);
	}
	public	void breathe()
	{age = 1;}
	
	public void show() {
		super.show();
		System.out.printf("name=%s, age=%d\n", this.name, age);
		System.out.println("난 Person의 show()메서드");
	}
	public void moving() {
		System.out.println("Person이 움직인다.");
	}
}

class Man extends Person {
	
	final int IQ = 150;
	private int money;
	private String job;
	public Man() {
		super(); 
		System.out.println("난 Man의 기본생성자");
	}
	public Man(String name, int age, int money, String job) {
		
		//super();//Person() 호출하라
		//Person(name, age);
		super(name, age);
		
		System.out.println("난 인자 4개인 Man생성자");
//		this.name = name; 
//		this.age = age;
		this.money = money;
		this.job = job;
		
	}
	public void show() {
		
		super.show();
		System.out.printf("Person의 IQ=%d\n", super.IQ);
		System.out.printf("IQ=%d\n", this.IQ);
//		System.out.printf("name=%s, age=%d\n", this.name, age); 
		System.out.printf("money=%d, job=%s\n", money, job); 
		
	}
	public void work() {
		System.out.println("Man이 일한다.");
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getJob() {
		return job;
	}
	public void moving() {
		System.out.println("Man이 움직인다.");
	}
	
}

public class Polymor0201 {

	public static void main(String[] args) {
		//Man jaesuk = 
		//Person jaesuk = 
		Mammal jaesuk = 
			new Man("유재석", 51, 70000, "국민MC");
		jaesuk.talk(); //Person의 talk()
		jaesuk.show(); //Man의 show()
		jaesuk.moving();
	}

}
