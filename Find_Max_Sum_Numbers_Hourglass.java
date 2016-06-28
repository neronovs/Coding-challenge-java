import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        //Summing numbers from the array pattern "hourglasses"
        int temp = 0, res = -64;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp = arr[0 + i][0 + j] + arr[0 + i][1 + j] + arr[0 + i][2 + j] +
                                            arr[1 + i][1 + j] +
                        arr[2 + i][0 + j] + arr[2 + i][1 + j] + arr[2 + i][2 + j];
                /*int i=0, j=1;        
                System.out.print(arr[0 + i][0 + j]);
                System.out.print(arr[0 + i][1 + j]);
                System.out.println(arr[0 + i][2 + j]);
                
                System.out.println(arr[1 + i][1 + j]);
                
                System.out.print(arr[2 + i][0 + j]);
                System.out.print(arr[2 + i][1 + j]);
                System.out.print(arr[2 + i][2 + j]);*/
                if (res < temp) res = temp;
            }
        }
        //Show the result
        System.out.println(res);
    }
}
