package test;

import java.util.Scanner;

public class HackerRankChallenge4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = "abc",s1=null;
		long count=0;
		long n = scanner.nextLong();
		s1=s.substring(0, (int) (n%s.length()));

		
		
		
		if (s.length() == n)
			count=s.length()-s.replace("a", "").length();
		if (s.length() > n)
            count=s.substring(0, (int) n).length()-s.substring(0, (int) n).replace("a", "").length();
		if (s.length() < n)
			count=(s.length()-s.replace("a", "").length()) *(n / s.length())+s1.length()-s1.replace("a", "").length();
		System.out.println(count);
			
		/*	test= new String(new char[(int) (n / s.length())]).replace("\0",s)+s.substring(0, (int) (n%s.length())); 
			//test = String.format("%0" + (n / s.length()) + "d", 0).replace("0", s)
					//+ s.substring(0, (int) (n % s.length()));
		

		System.out.println(test.length()-test.replace("a", "").length());*/

	}

}
