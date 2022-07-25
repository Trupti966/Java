
public class Pattern13 {

	public static void main(String[] args) {
		int i,j,k,n=5;
		for(i=1;i<=n;i++) {
			for(k=n;k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=(2*i)-1;j++) {
				if(i==1 || i==n || j==1 || j==(2*i)-1) {
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
