package test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class HackerRankChallenge1 {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
       int[] paired = new int[ar.length];
        Arrays.fill(paired, -1);
        int count = 0, m = 0;
        List<Integer> list = new ArrayList<>(paired.length);

        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
            	for (int h : paired) {
        			list.add(Integer.valueOf(h));
        		}
                System.out.println(list);
                while (list.contains(k))
                    k++;
                while (list.contains(i))
                    i++;
                if (k < n && ar[i] == ar[k] && i != k) {
                    System.out.println("Value in ar[" + i + "] is " + ar[i] + "and Value in ar[" + k + "] is " + ar[k]);
                    paired[m] = i;
                    ++m;
                    paired[m] = k;
                    ++m;                   
                    ++count;
                    break;
                }
            }
        }

        return count;

    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
