
public class Pattern17 {

	public static void main(String[] args) {
		int i,j,k,n=5;
		for(i=1;i<=n;i++) {
			for(k=n;k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=(2*i)-1;j++) {
				if(j==1 ||j==(2*i)-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(i=2;i<=n;i++) {
			for(k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=11-(2*i);j++) {
				if(j==1||j==11-(2*i)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
