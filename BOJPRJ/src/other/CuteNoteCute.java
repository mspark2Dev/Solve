package other;

import java.util.Scanner;

public class CuteNoteCute {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		int nc = 0;
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int now = sc.nextInt();
			if(now == 0) {
				nc++;
			} else {
				c++;
			}
		}
		
		System.out.println(c > nc ? "Junhee is cute!" : "Junhee is not cute!");
	}

}
