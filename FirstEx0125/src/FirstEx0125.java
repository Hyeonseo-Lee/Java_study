package src;

public class FirstEx0125 {

	public static void main(String[] args) {
		int a = 5;
		System.out.println("study");
		System.out.print("hello JAVA\n");
		System.out.print("INHA\n");
		System.out.printf("DecimalNum=%d\n", 7);
		System.out.printf("a=%d\n", a);
		
		//float fv = 3.14f;
		float fv = (float)3.14;
		double dv = 6.28;
		System.out.println("fv=" + fv);
		System.out.print("fv=" + fv + "\n");
		System.out.printf("fv=%f\n", fv);
		System.out.printf("fv=%.2f\n" , fv);
		System.out.printf("fv=%07.2f\n", fv);
		System.out.printf("fv=%7.2f\n", fv);	
		System.out.printf("fv=%-7.2f\n", fv);
		
		System.out.printf("dv=%.2f\n" , dv);
		
		char ch = 'A';
		System.out.printf("ch=%c\n", ch);
		System.out.printf("ch=%d\n", (int)ch);
		
		String name = "gildong";
		System.out.printf("name=%s\n", name);
		System.out.println("name=" + name);
		System.out.print("name=" + name + "\n");
		
		final double PI = 3.14;
		//PI = 3.14;//상수는 수정 불가..ERROR
		System.out.printf("PI=%.2f\n", PI);
		
		int s = 15 / 2;
		int p = 13 % 4;
		System.out.printf("s=%d, p=%d\n",s,p);
		
		int m = 3;
		//m = m + 1;
		m++;
		System.out.printf("m=%d\n", m);
	}
}