package edu.forextwo;



public class forExTwo0129 {

	public static void main(String[] args) {
//		아래 for 문은 무한반복문
//		for ( ; ; )
//			System.out.println("book");
		
		int num[] = {1, 2, 3};
		for(int k : num)
			System.out.printf("k=%d\n", k);
		
		for(int i = 0; i<=2; i++)
			System.out.printf("num[%d]=%d\n", i, num[i]);
	
		

	}

}
