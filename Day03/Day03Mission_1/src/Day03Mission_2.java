import java.util.Scanner;

public class Day03Mission_2 {

	public static void main(String[] args) {
		int a, count, count_1 = 0;
		System.out.print("소수구하기 프로그램\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("소수를 구할 정수 한개 입력:");
		a = sc.nextInt();
		for (int c=2; c<=a; ++c) {
			count = 0; 
			for (int i=2; i<c; ++i) {
				if (c%i == 0) 
					count++;
					
			
		}if (count == 0) {
			System.out.printf("%d은(는) 소수입니다.", c);
			count_1++;
	} 	

} System.out.printf("1~%d 사이의 소수 개수=%d", a, count_1 );
}
}
