package edu.oopfirst;

import java.util.Scanner;

class Person {
	private String name = null;
	private int age = 0;
	//기본생성자(default Constructor)..매개변수가 없음
	public Person() {
		System.out.println("난 Person 기본 생성자");
	}
	
	public Person(String pname, int page)
	{
		System.out.println("난 매개변수 두개인 Person 생성자");
		name = pname;
		age = page;
	}
	
	public void setName(String pname) {		
		name = pname ; 
	}
	
	public void setAge(int page) {
		age = page;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
		
	public	void talk() 
	{	name = "아무개";
		System.out.println("talk()메서드이다.");}
	public	void breathe()
	{age = 1;}
}

public class OOPExOne0130 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myname = null;
		int myage = 0;
		System.out.print("이름 입력하시오:");
		myname = sc.nextLine();
		System.out.println("나이 입력하시오:");
		myage = sc.nextInt();
		Person hyunbin = new Person(myname, myage);
		System.out.printf("hyunbin.name=%s\n", hyunbin.getName());
		System.out.printf("hyunbin.name=%d\n", hyunbin.getAge());
		Person hodong = new Person("호동", 45); 
		System.out.printf("hodong.name=%s\n", hodong.getName());
		System.out.printf("hodong.age=%d\n", hodong.getAge());
		Person gildong = new Person(); 
		//gildong.name = "길동"; 
		gildong.setName("길동");
		//System.out.printf("gildong.name=%s\n", gildong.name);
		System.out.printf("gildong.name = %s\n", gildong.getName());
		//gildong.age = 23;
		gildong.setAge(23);
		//System.out.printf("gildong.age=%d\n", gildong.age);
		System.out.printf("gildong age = %d\n", gildong.getAge());
		gildong.talk();		
	}
}
