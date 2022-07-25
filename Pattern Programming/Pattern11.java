
public class Pattern11 {

	public static void main(String[] args) {
		int i,j,k,n=5;
		for(i=1;i<=n;i++) {
			for(k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=(11-2*i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
