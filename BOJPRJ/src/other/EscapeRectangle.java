package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EscapeRectangle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();

		br.close();

		int x = Integer.parseInt(line.split(" ")[0]);
		int y = Integer.parseInt(line.split(" ")[1]);
		int w = Integer.parseInt(line.split(" ")[2]);
		int h = Integer.parseInt(line.split(" ")[3]);

		List<Integer> arr = new ArrayList<Integer>();
		arr.add(w - (w-x)); //left
		arr.add(w - x); //right
		arr.add(h - (h - y)); //top
		arr.add(h - y); //bottom
		
		System.out.println(Collections.min(arr));

	}

}
