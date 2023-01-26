import java.util.Scanner;

public class Day0126Mission {
	public static void main(String[] args) {
		Scanner  sc= new Scanner(System.in);
		String name = null;
		String major = null;
		String address = null;
		int English = 0;
		int Physics = 0;
		int calculus = 0;
		int tol = 0;
		double aer = 0;
		System.out.print("이름을 입력하세요!!\n");
		name = sc.nextLine();
		System.out.print("학과명을 입력하세요!!\n");
		major = sc.nextLine();
		System.out.print("영어 점수 입력:");
		English = sc.nextInt();
		System.out.print("물리학 점수 입력:");
		Physics = sc.nextInt();
		System.out.print("미적분학 점수 입력:");
		calculus = sc.nextInt();
		System.out.print("주소를 입력하세요!!");
		sc.nextLine();
		address = sc.nextLine();
		System.out.printf("이름 = %s, ", name);
		System.out.printf("학과명 = %s\n", major);
		System.out.printf("영어 = %d, ", English);
		System.out.printf("물리학 = %d, ", Physics);
		System.out.printf("미적분학 = %d\n", calculus);
		tol = English + Physics + calculus;
		System.out.printf("총점 = %d, ", tol);
		aer = tol / 3; 
		System.out.printf("평균 = %.1f\n", aer);
		System.out.printf("주소 = %s", address);
		
	}

}
