package strings;

import java.util.Scanner;

public class SentenceCount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		sc.close();
		
		if(line.isEmpty()) {
			System.out.println(0);
		} else {
			String[] sen = line.split(" ");
			System.out.println(sen.length);	
		}
	}

}
