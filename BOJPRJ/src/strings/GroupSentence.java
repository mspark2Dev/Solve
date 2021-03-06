package strings;

import java.util.HashSet;
import java.util.Scanner;

public class GroupSentence {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int groupCount = 0;
		
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			if(!s.isEmpty()) {
				if(isGroup(s)) groupCount++;
			}
		}
		sc.close();
		
		System.out.println(groupCount);
		
	}
	
	public static boolean isGroup(String s) {
		
		boolean group = true;
		
		String[] sArr = s.split("");
		HashSet<String> sSet = new HashSet<String>();
		
		for(String a : sArr) {
			sSet.add(a);
		}
		
		if(sArr.length == 1) {
			return group;
		} else {
			for(String b : sSet) {
				int idx = -1;
				int preIdx = -1;
				do {
					idx = s.indexOf(b, preIdx + b.length());
					if(idx != -1 && preIdx != -1) {
						if(preIdx + 1 == idx) {
							group = group ? true : false;
						} else {
							group = false;
						}
					}
					preIdx = idx;
				} while (idx > -1);
			}
			return group;
		}
		
	}

}
