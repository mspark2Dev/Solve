package forgrammer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class QuickAaddB {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			String l = br.readLine();
			int a = Integer.parseInt(l.split(" ")[0]);
			int b = Integer.parseInt(l.split(" ")[1]);
			bw.write(a + b + "\n");
        }
        bw.flush();
	}

}
