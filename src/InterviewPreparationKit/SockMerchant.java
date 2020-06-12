package InterviewPreparationKit;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/***********************************************************************************************************************
 *** Warm-up Challenges > Sock Merchant ****
 John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of
 integers representing the color of each sock,  determine how many pairs of socks with matching colors there are.

 For example, there are n=7 socks with colors as=[1,2,1,2,1,3,2]. There is one pair of color 1 and one of color 2.
 There are three odd socks left, one of each color. The number of pairs is 2.

 Function Description:
 Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching
 pairs of socks that are available.

 sockMerchant has the following parameter(s):
 n: the number of socks in the pile
 ar: the colors of each sock

 Input Format:
 The first line contains an integer n, the number of socks represented in ar.
 The second line contains n space-separated integers describing the colors ar[i] of the socks in the pile.

 Constraints:

 Output Format:
 Return the total number of matching pairs of socks that John can sell.

 Sample Input:
 9
 10 20 20 10 10 30 50 10 20
 Sample Output
 3
 **********************************************************************************************************************/


public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        //Map res = new HashMap();
        HashMap<Integer, Integer> res_map = new HashMap<Integer, Integer>();

        for (int i = 0; i<n; i++) {
            if(res_map.get(ar[i]) == null)
                res_map.put(ar[i], 1);
            else
                res_map.put(ar[i],res_map.get(ar[i])+1);
        }

        AtomicInteger res = new AtomicInteger();
        res_map.forEach( (key, value) -> {
            res.addAndGet((int) Math.floor(value / 2));
        });

        return res.get();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(n >= 1 && n <= 100){
            int[] ar = new int[n];

            String[] arItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arItem = Integer.parseInt(arItems[i]);
                if( arItem < 1 || n > 100 )
                    System.exit(0);
                ar[i] = arItem;
            }

            int result = sockMerchant(n, ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();
        }
        scanner.close();
    }
}
