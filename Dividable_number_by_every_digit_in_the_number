import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int calculation(int n) {
        String nStr = Integer.toString(n);
        int res = 0;
        
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            int temp = Integer.parseInt(String.valueOf(nStr.charAt(i)));
            if (temp > 0) {
                if (n % temp == 0)
                    res++;
            } 
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(calculation(n));
        }
    }
}
