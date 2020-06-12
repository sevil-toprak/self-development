package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/***********************
 Lexicographical order is often known as alphabetical order when dealing with strings. A string is greater than another string if it comes later in a lexicographically sorted list.

 Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:

 It must be greater than the original word
 It must be the smallest word that meets the first condition
 For example, given the word w=abcd, the next largest word is abdc.

 Complete the function biggerIsGreater below to create and return the new string meeting the criteria. If it is not possible, return no answer.

 Function Description:
 Complete the biggerIsGreater function in the editor below. It should return the smallest lexicographically higher string possible from the given string or no answer.

 biggerIsGreater has the following parameter(s):
 w: a string

 Input Format:
 The first line of input contains , the number of test cases.
 Each of the next  lines contains .

 Constraints:

 Output Format:
 For each test case, output the string meeting the criteria. If no answer exists, print no answer.
 ******/


public class BiggerIsGreater {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {

//        int len = w.length();
//        for (int i = w.length()-1; i >= 0; i--) {
//
//
//        }

        return "abcd";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("output.txt")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
