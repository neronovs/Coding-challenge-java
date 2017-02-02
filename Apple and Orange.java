import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(); //the start point of the distance
        int t = in.nextInt(); //the end point of the distance
        int a = in.nextInt(); //the placement of the appletree
        int b = in.nextInt(); //the placement of the orangetree
        int m = in.nextInt(); //the quantity of apples
        int n = in.nextInt(); //the quantity of oranges
        int[] apple = new int[m]; //the apples that fell down
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n]; //the oranges that fell down
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
         
        int appleQuantity = 0;
        for(int i = 0; i < m; i++) {
            int coordinates = a + apple[i];
            if (coordinates >= s && coordinates <= t) appleQuantity++;
        }
       
        int orangeQuantity = 0;
        for(int i = 0; i < n; i++) {
            int coordinates = b + orange[i];
            if (coordinates >= s && coordinates <= t) orangeQuantity++;
        }
        
        System.out.print(appleQuantity+"\n");
        System.out.print(orangeQuantity);
    }
}
