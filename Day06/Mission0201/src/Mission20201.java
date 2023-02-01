
public class Mission20201 {
	public static void main(String[] args) {
		int val[] = new int[10];
		int nval[] = new int[10];
		for (int i = 0; i<10; i++) {
			val[i] = i + 1;
		}
		
		for (int j = 0; j<10; j++) {
			if((j+1) % 2 == 1) {
				nval[j] = val[j+1];
				
			}
			if ((j+1) % 2 == 0) {
				nval[j] = val[j-1];
				
			}
		}
		for (int k = 0; k<10; k++) {
			System.out.printf("%d\n", nval[k]);
		}
		
		
	}

}
