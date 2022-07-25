
public class Num_Pattern4 {

	public static void main(String[] args) {
		int i,j,n=5,count=1;
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print(count++ +" ");
			}
			count=1;
			System.out.println();
		}
		for(i=2;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(count++ +" ");
			}
			count=1;
			System.out.println();
		}

	}

}
