import java.util.Scanner;

public class Test {

    //Summation
    public static int Summation(int n) {
        if (n <= 0) return 0;
        else return n + Summation(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Input a number for the Summation");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println("The summation for number " + n + " is: " + Summation(n));
    }
}
