import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'rearrangeString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER n
     */

    public static String rearrangeString(String s, int n) {
        System.out.println(s);
        int split = 0, counter = 0;
        
        List<String> unsharedLett = new ArrayList<String>(); 
        
        for (split = 0; split < s.length(); split++) {
            System.out.println(s.charAt(split));
            
            if (s.charAt(split) == s.charAt(split+1)) {
                counter++;
                
            } if (s.charAt(split) != s.charAt(split+1)) {
                
                unsharedLett.add(s.substring(split, split+counter));
                System.out.println(unsharedLett);
            }
        }
                
        return s;
    }

}

public class Solution {