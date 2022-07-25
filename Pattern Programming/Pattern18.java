
public class Pattern18 {

	public static void main(String[] args) {
		
		int i,j,k,n=5;
		for(i=1;i<=n;i++) {
			for(k=n;k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=n;i++) {
			System.out.print(" ");
			for(j=1;j<=9;j++) {
				if(j<=3 || j>=7) {
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
