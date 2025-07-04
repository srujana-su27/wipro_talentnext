package java_fundamentals;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n = 10;n<=99;n++) {
			if(n <=1) {
				continue;
			}
			int count =0;
			for(int i =1;i<=n;i++) {
				if(n % i ==0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(n + " ");
			}
		}
	}

}
