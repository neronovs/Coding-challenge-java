public class Test {

    //Exponentiation
    public static int Exponentiation(int n, int exp) {
        if (exp <= 0) return 1;
        else return n * Exponentiation(n, exp - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Input a number and the exponant");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int exp = in.nextInt();
        
        System.out.println("The exponentiation ^" + exp + " for the number " + n + " is: " + Exponentiation(n, exp));
    }
    
}
