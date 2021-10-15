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
				line = line.replaceAll("[^\\(\\)\\[\\]]", ""); // ��ȣ ���� ��� ���� ����
				
				if(line.startsWith(")") || line.startsWith("]")) { // ������ �ݴ� ���ڸ� ?
					flag = false;
				} else if (line.length() == 0) { // ��ȣ�� ���� ���� ���ڸ� ?
					flag = true;
				} else { // �� �� ��ȣó��
					for(int i=0; i<line.length(); i++) {
						char now = line.charAt(i);
						
						if(now == '(' || now == '[') { // ���� ���ڸ� ?
							stack.push(now);
						} else { // �ݴ� ���ڸ� ?
							if(stack.isEmpty()) { // �����ϴµ� ������ ��������� ?
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