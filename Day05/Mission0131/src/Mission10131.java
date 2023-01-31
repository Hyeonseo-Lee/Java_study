import java.util.Scanner;

class Car {
	protected String name, color, address = null;
	protected int num, vel = 0;
	
	public void setter(String name, String color, int num, String address, int vel) {
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
	
	public void lsetter (int fare, String comp) {
		this.fare = fare;
		this.comp = comp;
	}
	
	public int getfare () {
		return fare;
	}
	
	public String getcomp() {
		return comp;
	}
	
}

public class Mission10131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String carname, carcolor, caradd, carcomp = null;
		int carnum, carfare, carvel, upvel, downvel = 0;
		LentCar mycar = new LentCar();
		
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
		mycar.setter(carname, carcolor, carnum, caradd, carvel);
		mycar.lsetter(carfare, carcomp);
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
		
		
		
		
		
		
		//		Car mycar = new Car();
//		String carname, carcolor, caradd = null; 
//		System.out.println("차 이름을 입력하시오. : ");
//		carname = sc.nextLine();
//		
//	    System.out.println("차 색을 입력하시오. : ");
//	    carcolor = sc.nextLine();
//	 
//	    int carnum, carvel = 0;
//	    System.out.println("차량 번호를 입력하시오. : ");
//		carnum = sc.nextInt();
//		
//		System.out.println("운전자 주소를 입력하시오. : ");
//		sc.nextLine();
//		caradd = sc.nextLine();
//		
//		System.out.println("속도를 입력하시오. : ");
//		carvel = sc.nextInt();
//		mycar.setter(carname, carcolor, carnum, caradd, carvel);
//		System.out.printf("\n차 이름 : %s", mycar.getname());
//		System.out.printf("\n차 색 : %s", mycar.getcolor());
//		System.out.printf("\n차량 번호 : %d", mycar.getnum());
//		System.out.printf("\n운전자 주소 : %s", mycar.getadd());
//		System.out.printf("\n속도 : %d", mycar.getvel());
		
	

	}

}
