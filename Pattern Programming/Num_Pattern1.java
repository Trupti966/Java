
public class Num_Pattern1 {

	public static void main(String[] args) {
		byte i,j,n=10;
		byte count=1;
//		for(i=1;i<=n;i++) {
//			for(j=1;j<=i;j++) {
//				System.out.print(count++);
//			}
//			count=1;
//			System.out.println();
//		}
		
		// OR
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j +" ");
			}
			count=1;
			System.out.println();
		}

	}

}

