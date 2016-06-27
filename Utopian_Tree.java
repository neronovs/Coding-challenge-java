import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int Cicle(int numberOfCicles, int hight) {
        if (numberOfCicles <= 0) return 1;
        else {
            while (numberOfCicles > 0) {
                hight *= 2;
                numberOfCicles--;
                if (numberOfCicles > 0) {
                    hight++;
                    numberOfCicles--;
                }
                else break;
            }
            return hight;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int numberOfCicles = in.nextInt();
            int hight = 1;
            System.out.println(Cicle(numberOfCicles, hight));
        }
    }
}
