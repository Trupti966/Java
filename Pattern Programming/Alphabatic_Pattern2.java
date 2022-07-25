
public class Alphabatic_Pattern2 {

	public static void main(String[] args) {
		char a=65;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(a++);
			}
			a=65;
			System.out.println();
		}

	}

	}

