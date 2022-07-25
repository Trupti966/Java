
public class Pattern9 {

	public static void main(String[] args) {
		int i,j,k,n=5;
		for(i=1;i<=n;i++) {
			for(k=1;k<=(n-i)+1;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
