import java.util.Scanner;

public class Mission10130 {

	public static void main(String[] args) {
		int val[] = new int[6];
		Scanner sc = new Scanner(System.in);
		
		int j= 0; 
		for (int i=0 ;i<=5; ) {
			int num = 0;
			j = 0;
			System.out.println("로또번호 입력 : ");
			val[i] = sc.nextInt();
			if (i>=1) {
				while (num < i) {
					if (val[num] == val[i]) {
					System.out.println("같은 번호가 있습니다!");
					num++;
					j = 1;
					}
					else { 
						num++;			
				} 
					
			}
			}  
			if (j != 1)
				i++;
		}
		
		System.out.printf("입력된 로또번호: %d %d %d %d %d %d ", val[0], val[1],val[2], val[3],val[4], val[5]);
		
		
	}
}