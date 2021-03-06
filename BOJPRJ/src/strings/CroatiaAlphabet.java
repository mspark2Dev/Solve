package strings;

import java.util.Scanner;

public class CroatiaAlphabet {

	public static void main(String[] args) {
		String[] croaAlpha = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();

		int count = 0;

		for (String c : croaAlpha) {
			int idx = input.indexOf(c);
			while (idx > -1) {

				count++;
				input = input.substring(0, idx) + " " + input.substring(idx + c.length());
				idx = input.indexOf(c);
			}
		}

		input = input.replaceAll("\\p{Z}", "");
		count += input.length();

		System.out.println(count);

	}

}
