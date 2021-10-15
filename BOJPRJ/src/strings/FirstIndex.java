package strings;

import java.util.Scanner;

public class FirstIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();

		String[] sArr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		
		int[] iArr = new int[26];
		
		for(int i=0; i<sArr.length; i++) {
			iArr[i] = S.indexOf(sArr[i]);
		}
		
		for(int a : iArr) {
			System.out.print(a + " ");
		}
	}

}
