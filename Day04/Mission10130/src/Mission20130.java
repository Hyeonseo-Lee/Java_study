import java.util.Scanner;

class Car {
	private String name, color, address = null;
	private int vel, num = 0;
	
	public void setname(String pname) {
		name = pname;
	}
	public String getname() {
		return name;
		
	}
	public void setcolor(String pcolor) {
		color = pcolor;
	}
	public String getcolor() {
		return color;
		
	}
	
	public void setnum(int pnum) {
		num = pnum;
	}
	public int getnum() {
		return num;
	}
	public void setadd(String padd) {
		address = padd;
	}
	public String getadd() {
		return address;
	}
	public void setvel(int pvel) {
		vel = pvel;
	}
	public int getvel() {
		return vel;
	}
}

public class Mission20130 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car mycar = new Car();
		String carname = null; 
		System.out.println("차 이름을 입력하시오. : ");
		carname = sc.nextLine();
		mycar.setname(carname);
		
		String carcolor = null;
	    System.out.println("차 색을 입력하시오. : ");
	    carcolor = sc.nextLine();
	    mycar.setcolor(carcolor);
	   
		int carnum = 0;
	    System.out.println("차량 번호를 입력하시오. : ");
		carnum = sc.nextInt();
		mycar.setnum(carnum);
		
		String caradd = null;
		System.out.println("운전자 주소를 입력하시오. : ");
		sc.nextLine();
		caradd = sc.nextLine();
		mycar.setadd(caradd);
		
		int carvel = 0;
		System.out.println("속도를 입력하시오. : ");
		carvel = sc.nextInt();
		mycar.setvel(carvel);
		System.out.printf("\n차 이름 : %s", mycar.getname());
		System.out.printf("\n차 색 : %s", mycar.getcolor());
		System.out.printf("\n차량 번호 : %d", mycar.getnum());
		System.out.printf("\n운전자 주소 : %s", mycar.getadd());
		System.out.printf("\n속도 : %d", mycar.getvel());
		
		
		
		
		
		

	}

}
