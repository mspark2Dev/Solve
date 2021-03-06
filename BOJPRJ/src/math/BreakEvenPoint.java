package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakEvenPoint {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		
		br.close();
		
		int fixedCost = Integer.parseInt(line.split(" ")[0]);
		int variableCost = Integer.parseInt(line.split(" ")[1]);
		int cost = Integer.parseInt(line.split(" ")[2]);
		
		if(variableCost >= cost) {
			System.out.println(-1);
		} else {
			System.out.println(fixedCost / (cost - variableCost) + 1);
		}
	}

}
