
public class Num_Pattern3 {

	public static void main(String[] args) {
		int i,j,n=5,count=1;
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print(count++ +" ");
			}
			count=1;
			System.out.println();
		}

	}

}
