
public class Day03Mission_1 {
	public static void main(String[] args) {
		for (int val = 1; val<10; ++val) {
			for (int i = 2; i<6; ++i) {
					System.out.printf("%d * %d = %d\t", i, val, i*val );
				if(i == 5) {
					System.out.print('\n');
				}
				
				
			}
		}
		
	
	for (int val = 1; val<10; ++val) {
		for (int i = 6; i<10; ++i) {
				System.out.printf("%d * %d = %d\t", i, val, i*val );
			if(i == 9) {
				System.out.print('\n');
			}
				
		}
	}
	
}

}
