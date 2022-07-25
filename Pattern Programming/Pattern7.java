
public class Pattern7 {
	public static void main(String[] args) {
		int i,j,k,n=5;
		for(i=1;i<=n;i++) {
			for(k=1;k<=(i-1);k++) {
				System.out.print(" ");
			}
			for(j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
