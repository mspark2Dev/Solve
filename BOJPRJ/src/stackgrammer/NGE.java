package stackgrammer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class NGE {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n];
		int[] res = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		for (int i=0; i<n; i++) {
			if(stack.isEmpty()) {
				stack.push(i);
			}
			
			while(!stack.isEmpty() && a[stack.peek()] < a[i]) {
				res[stack.pop()] = a[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			res[stack.pop()] = -1;
		}
		
		for (int i=0; i<res.length; i++) {
			bw.write(res[i] + " ");
		}
		bw.flush();
	}

}
