package stackgrammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StackQ {

	static List<Integer> stack = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String[] sArr = s.split(" ");

			if (sArr.length > 1) {
				_push(Integer.parseInt(sArr[1]));
			} else {
				switch (sArr[0].toLowerCase()) {
				case "pop":
					_pop();
					break;
				case "size":
					_size();
					break;
				case "empty":
					_empty();
					break;
				case "top":
					_top();
					break;
				}
			}
		}
		
		br.close();

	}

	public static void _push(int a) {
		stack.add(a);
	}

	public static void _pop() {
		if (stack.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(stack.get(stack.size() - 1));
			stack.remove(stack.size() - 1);
		}
	}

	public static void _size() {
		System.out.println( stack.size());
	}

	public static void _empty() {
		System.out.println(stack.size() == 0 ? 1 : 0);
	}

	public static void _top() {
		if (stack.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(stack.get(stack.size() - 1));
		}
	}

}
