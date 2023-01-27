package edu.gugudan;

public class GuGuDan0127 {

	public static void main(String[] args) {
		int dan = 2, val = 1;
		for(dan = 2; dan <= 9; ++dan)
		{	if (dan ==6)
				break;
			for(val = 1; val <= 9; ++val ) {
				if (val == 3)
					break;
//				if (val == 4)
//					continue;
					System.out.println("나 실행될까?");
				System.out.printf("%d*%d = %d\n", dan, val, dan*val);
			}
		}
		
		for(int i = 1 ; i <= 10 ; ++i ) {
			if(i==6)
				break;
			System.out.printf("i=%d\t", i);
		}
	}

} 

