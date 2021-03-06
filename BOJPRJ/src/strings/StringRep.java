package strings;

import java.util.Scanner;

public class StringRep {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String line = sc.nextLine();
			int count = Integer.parseInt(line.split(" ")[0]);
			String[] s = line.split(" ")[1].split("");
			String res = "";
			
			for (String r : s) {
				for(int j=0; j<count; j++) {
					res += r;
				}
			}
			
			System.out.println(res);
		}
		sc.close();
	}

}
