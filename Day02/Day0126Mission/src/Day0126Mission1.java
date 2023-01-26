import java.util.Scanner;

public class Day0126Mission1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int leap_year = 0; 
		leap_year = sc.nextInt();
		if (leap_year/4 == 0 && (leap_year % 100 != 0 || leap_year / 400 == 0)){
			System.out.print("윤년입니다.");			
		}
		else {
			System.out.print("윤년이 아닙니다.");
		}
	}
}