package InterviewPreparationKit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import static java.lang.System.exit;

/***********************************************************************************************************************
 *** Warm-up Challenges >  Counting Valleys ****
 * Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography.
 * During his last hike he took exactly n steps. For every step he took, he noted if it was an uphill, U, or a downhill,
 * D step. Gary's hikes start and end at sea level and each step up or down represents a 1 unit change in altitude.
 * We define the following terms:
 *
 * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with
 * a step down to sea level.
 * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with
 * a step up to sea level.
 * Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
 *
 * For example, if Gary's path is , he first enters a valley  units deep. Then he climbs out an up onto a mountain  units high.
 * Finally, he returns to sea level and ends his hike.
 *
 * Function Description
 *
 * Complete the countingValleys function in the editor below. It must return an integer that denotes the number of
 * valleys Gary traversed.
 *
 * countingValleys has the following parameter(s):
 *
 * n: the number of steps Gary takes
 * s: a string describing his path
 * Input Format
 *
 * The first line contains an integer , the number of steps in Gary's hike.
 * The second line contains a single string , of  characters that describe his path.
 *
 * Constraints:
 *
 * Output Format:
 * Print a single integer that denotes the number of valleys Gary walked through during his hike.
 *
 * Sample Input:
 * 8
 * UDDDUDUU
 *
 * Sample Output:
 * 1
 **********************************************************************************************************************/


public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int count = 0;
        int step = 0;  // sea level
        boolean isNeg = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') {
                step--;
            } else {
                step++;
            }

            if(step == 0 && isNeg)
                count ++;

            if(step <= 0)
                isNeg = true;
            else
                isNeg= false;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //String s = scanner.nextLine();

        int n = 11;
        String s = "DUDDUUUUDDD";

        if (n < 2 || n > Math.pow(2, 6)) {
            System.exit(0);
        }

        // I got an error because of this line. If n is very big value like 10^6, compile time was so long.
        // After delete this lines, code run successfully.
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf('U', i) < 0 && s.indexOf('D', i) < 0)
                System.exit(0);
        }

        int result = countingValleys(n, s);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
