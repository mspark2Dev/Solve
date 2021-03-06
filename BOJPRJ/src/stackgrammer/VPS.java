package stackgrammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class VPS {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			Stack<Character> stack = new Stack<>();
			String input = br.readLine();
			boolean flag = true;
			for (int j = 0; j < input.length(); j++) {
				char a = input.charAt(j);
				if (a == '(')
					stack.push(a);
				else if (a == ')') {
					if (stack.size() > 0)
						stack.pop();
					else
						flag = false;
				}
				if (!flag) break;
			}
			if (stack.size() > 0) flag = false;
			System.out.println(flag ? "YES" : "NO");
		}
		

	}
}
