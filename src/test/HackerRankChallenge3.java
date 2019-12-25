package test;

import java.io.IOException;
import java.util.Scanner;

public class HackerRankChallenge3 {

	// private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] c = { 0, 0, 1, 0, 0, 0, 1, 0, 0,1,0,0,0,0,0,1,0,1,0,0,1,0};
		int count=0;

		for (int i = 0; i < c.length; i++) {
			if (i < c.length - 2 && ((c[i + 1] == 0 && c[i + 2] == 0)||(c[i + 1] != 0))) {
				System.out.println( "Value of C["+i+"+1] is "+c[i+1]+ "and Value of C["+i+"+2] is "+c[i+2]);
				i = i + 1;
				count++;
				System.out.println("Jumped 2 cloud");
			} else if ((i < c.length - 2 && c[i + 1] == 0 && c[i + 2] != 0)) {
				System.out.println( "Value of C["+i+"+1] is "+c[i+1]+ "and Value of C["+i+"+2] is "+c[i+2]);
				count++;
				System.out.println("Jumped one cloud");
			} else if (i<c.length-1 && c[i + 1] == 0) {
				System.out.println("Jumped one cloud");
				System.out.println( "Value of C["+i+"+1] is "+c[i+1]);
				count++; 
				break;
			}
		}
		System.out.println(count);

	}
}
