package onedimension;

import java.util.Scanner;

public class OXQuize {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String preAnswer = "X";
			int rightCount = 0;
			int sum = 0;
			String s = sc.nextLine();
			String[] sArr = s.split("");
			for(String a : sArr) {
				if(a.equals("O")) {
					if(preAnswer.equals("O")) {
						sum += rightCount + 1;
					} else {
						sum += 1;
					}
					preAnswer = "O";
					rightCount++;
				} else {
					rightCount = 0;
					preAnswer = "X";
				}
			}
			
			System.out.println(sum);
		}
		sc.close();
	}

}
