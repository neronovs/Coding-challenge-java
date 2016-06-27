import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String toBinary(int n) {
        //System.out.println("toBinary--> in = " + n);
        String res = "";
        while (n > 0) {
            if (n % 2 == 1) res += "1 ";
            else  res += "0 ";
            
            if (n > 1) {
                //res += " ";
                n = n / 2;
            }
            else n = 0;
        }
        //System.out.println("toBinary--> out = " + res);
        return res;
    }
    
    public static int mostOnesInRow(String number) {
        //System.out.println("mostOnesInRow--> in = " + number);
        int temp = 0, res = 0;
        boolean itIsOne = false;
        Scanner scanner = new Scanner(number);
        for (int i = 0; i < number.length() / 2; i++) {
            
            String next = scanner.next();
            //System.out.println("mostOnesInRow--> scanner.next() = " + next);
            if (next.equals("1")) {
                itIsOne = true;
            } else itIsOne = false;
            
            if (itIsOne) temp++;
            else temp = 0;
            
            if (temp > res) res = temp;
        }
        //System.out.println("mostOnesInRow--> out = " + res);
        return res;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String number = toBinary(n);
        int res = mostOnesInRow(number);
        System.out.println(res);
    }
}
