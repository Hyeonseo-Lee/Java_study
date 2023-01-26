
import java.util.Scanner;

public class Day02 {

   public static void main(String[] args) {
      Scanner  sc= new Scanner(System.in);
      
      int age = 0;
      char blood = '\0';  //-> \0:null 문자라고 부름.
      String name= null;  //String name = 0; 과 같은 의미.
      double height = 0;
      System.out.print("나이를 입력:");
      age=sc.nextInt();  // 4B짜리 정수를 받아와서 age변수에 넣음.
      System.out.printf("age=%d\n",age);
      sc.nextLine();
      System.out.print("\n이름 입력:");
      //name = sc.next();
      name = sc.nextLine();//공백문자 다 읽음
      System.out.printf("name=%s\n",name);      
      System.out.print("혈액형 입력 : ");
      blood = (char)sc.next().charAt(0);  //char로 next를 받으려 하니 char은 2B고 next는 4B라서 오류가 뜸.
      System.out.printf("blood=%c",blood);
      System.out.print("\n키값 입력: ");
      height = sc.nextDouble();
      System.out.printf("height=%.2f\n", height);
   }

}