package solve;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompactString {

	public static int solution(String s) {
		int answer = s.length();

		for (int i = 1; i <= s.length() / 2; i++) {
			List<String> S = new ArrayList<String>();
			Pattern p = Pattern.compile("[a-z]{" + i + "}");
			Matcher m = p.matcher(s);
			int end = 0;
			while (m.find()) {
				S.add(m.group());
				end = m.end();
			}

			String res = "";

			for (int j = 0; j < S.size(); j++) {
				String first = S.get(j);
				int duplCnt = 0;
				for (int k = j + 1; k < S.size(); k++) {
					String next = S.get(k);

					if (first.equals(next)) {
						duplCnt++;
					} else {
						break;
					}
				}

				j += duplCnt;

				if (duplCnt == 0) {
					res += first;
				} else {
					res += Integer.toString(duplCnt + 1) + first;
				}
			}
			if (end != s.length()) {
				res += s.substring(end, s.length());
			}
			
			answer = answer > res.length() ? res.length() : answer;
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] s = { "aabbaccc", "ababcdcdababcdcd", "abcabcdede", "abcabcabcabcdededededede", "xababcdcdababcdcd",
				"xxxxxxxxxxyyy", "aaaaaaaaaab" };
		for (String a : s) {
			System.out.println(solution(a));
		}
	}

}
