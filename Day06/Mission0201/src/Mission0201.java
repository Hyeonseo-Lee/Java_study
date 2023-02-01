

import java.util.Scanner;

class Car {
	protected String name, color, address = null;
	protected int num, vel = 0;
	
	public Car() {
		
	}
	
	public Car (String name, String color, int num, String address, int vel) {
		this.name = name;
		this.color = color;
		this.num = num;
		this.address = address;
		this.vel = vel;
				
				
	}
	public String getname() {
		return name;	
	}
			
	public String getcolor() {
		return color;	
		}
			
	public int getnum() {
		return num;
	}
			
	public String getadd() {
		return address;
	}
	public int getvel() {
		return vel;
	}
			
}

class LentCar extends Car {
	int fare = 0;
	String comp = null;
	
	public LentCar() {
		}
	
	public LentCar (String name, String color, int num, String address, int vel, int fare, String comp) {
		super(name, color, num, address, vel);
		this.fare = fare;
		this.comp = comp;
	}
	
	public void setter (int fare, String comp) {
		
	}
			
	public int getfare () {
		return fare;
	}
			
	public String getcomp() {
		return comp;
	}
			
}

public class Mission0201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String carname, carcolor, caradd, carcomp = null;
		int carnum, carfare, carvel, upvel, downvel = 0;
		
				
		System.out.println("자동차종류 입력하시오. : ");
		carname = sc.nextLine();
		System.out.println("자동차색깔 입력하시오. : ");
		carcolor = sc.nextLine();
		System.out.println("자동차번호 입력하시오. : ");
		carnum = sc.nextInt();
		sc.nextLine();
		System.out.println("운전자주소 입력하시오. : ");
		caradd = sc.nextLine();
		System.out.println("자동차속도를 입력하시오. : ");
		carvel = sc.nextInt();
		System.out.println("렌트비 입력하시오. : ");
		carfare = sc.nextInt();
		sc.nextLine();
		System.out.println("렌트회사를 입력하시오. : ");
		carcomp = sc.nextLine();
		LentCar mycar = new LentCar(carname, carcolor, carnum, caradd, carvel, carfare, carcomp);
		
		System.out.printf("\n자동차종류 : %s", mycar.getname());
		System.out.printf("\n자동차색깔 : %s", mycar.getcolor());
		System.out.printf("\n자동차번호 : %s", mycar.getnum());
		System.out.printf("\n운전자주소 : %s", mycar.getadd());
		System.out.printf("\n현재 자동차의 속도는 시속 %dkm/h입니다.", mycar.getvel());
		System.out.printf("\n속도를 얼마나 올리시겠습니까 : ");
		upvel = sc.nextInt();
		System.out.printf("현재 자동차의 속도는 시속 %dkm/h입니다.", mycar.getvel()+ upvel);
		System.out.printf("\n속도를 얼마나 내리시겠습니까 : ");
		downvel = sc.nextInt();
		System.out.printf("현재 자동차의 속도는 시속 %dkm/h입니다.", mycar.getvel()+ upvel - downvel);

	}

}
