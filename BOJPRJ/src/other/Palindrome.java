package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		
		while(!line.equals("0")) {
			StringBuffer sb = new StringBuffer(line);
			String reverse = sb.reverse().toString();
			
			if(reverse.startsWith("0")) {
				reverse = reverse.substring(1);
			}
			
			if(line.equals(reverse)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
			line = br.readLine();
		}
		
		br.close();
	}

}
