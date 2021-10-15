package other;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DecompositionSum {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int N = Integer.parseInt(br.readLine());
        final int answer = getDecompositionNumber(N);

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

    static int getDecompositionNumber(int N) {
        for (int i = 1; i < N; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == N) {
                return i;
            }
        }
        return 0;
    }

}
