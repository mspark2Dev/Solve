package stackgrammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalanceWorld {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String line = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			
			boolean flag = true;

			if (line.equals(".") || line.isEmpty()) {
				break;
			} else {
				line = line.replaceAll("[^\\(\\)\\[\\]]", ""); // 괄호 제외 모든 문자 제거
				
				if(line.startsWith(")") || line.startsWith("]")) { // 시작이 닫는 문자면 ?
					flag = false;
				} else if (line.length() == 0) { // 괄호가 들어가지 않은 문자면 ?
					flag = true;
				} else { // 그 외 괄호처리
					for(int i=0; i<line.length(); i++) {
						char now = line.charAt(i);
						
						if(now == '(' || now == '[') { // 여는 문자면 ?
							stack.push(now);
						} else { // 닫는 문자면 ?
							if(stack.isEmpty()) { // 빼야하는데 스택이 비어있으면 ?
								flag = false;
							} else {
								char top = stack.peek();
								if((top == '(' && now == ')') || (top == '[' && now == ']')) {
									stack.pop();
								} else {
									flag = false;
								}
							}
						}
						if(!flag) break;
					}
					
					if(stack.isEmpty() && flag) {
						flag = true;
					} else {
						flag = false;
					}
					
				}
				
				System.out.println(flag ? "yes" : "no");
			}
		}
	}
}
