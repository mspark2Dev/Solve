package onedimension;

import java.util.Scanner;

public class ExceedTheAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<t; i++) {
			String s = sc.nextLine();
			String[] sArr = s.split(" ");
			int n = Integer.parseInt(sArr[0]);
			int sum = 0;
			for(int j=1; j<sArr.length; j++) {
				sum += Integer.parseInt(sArr[j]);
			}
			
			double aver = (double)sum/n;
			int cnt = 0;
			
			for(int k=1; k<sArr.length; k++) {
				cnt = Integer.parseInt(sArr[k]) > aver ? cnt + 1 : cnt;
			}
			
			double resAver = ((double)cnt / (double)n) * 100;
			System.out.println(String.format("%.3f%%", resAver));
		}
		sc.close();
	}
	
}
