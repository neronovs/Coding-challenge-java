import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;

        while (in.hasNext()) {
            n = in.nextInt();
            String output = "";
            int int3 = n / 3;
            int intRem = n - int3 * 3;

            while (int3 > 0 && intRem > 0 && intRem % 5 != 0) {
                int3--;
                intRem = n - int3 * 3;
            }
            if (intRem % 5 != 0) System.out.print("-1");
            else {
                while (int3 > 0) {
                    System.out.print("555");
                    int3--;
                }
                while (intRem > 0) {
                    System.out.print("3");
                    intRem--;
                }
            }
            System.out.println();
        }
    }
}
