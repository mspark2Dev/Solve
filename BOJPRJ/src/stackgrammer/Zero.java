package stackgrammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Zero {
	
	static List<Integer> stack = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int in = Integer.parseInt(br.readLine());
			
			if(in != 0) {
				_push(in);
			} else {
				_pop();
			}
		}
		
		br.close();
		
		Long sum = 0L;
		
		for(int s : stack) {
			sum+=s;
		}
		
		System.out.println(sum);
		
	}
	
	public static void _push(int a) {
		stack.add(a);
	}
	
	public static void _pop() {
		stack.remove(stack.size() - 1);
	}

}
