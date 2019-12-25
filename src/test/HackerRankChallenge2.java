package test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankChallenge2 {
	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		char[] steps = s.toCharArray();
		int valleys = 0;
		int[] a = new int[steps.length];
		a[0] = (steps[0] == 'D') ? (a[0] = -1) : (a[0] = 1);
		for (int i = 1; i < steps.length; i++) {
			a[i] = (steps[i] == 'D') ? a[i - 1] - 1 : a[i - 1] + 1;
		}
		for (int i = 1; i < steps.length; i++) {
			if (a[i] == 0 && a[i - 1] < 0) {
				++valleys;
			}
		}
		return valleys;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		// scanner.close();
	}
}
