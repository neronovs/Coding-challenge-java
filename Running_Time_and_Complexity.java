public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        boolean isPrime;

        while (in.hasNext()) {
            int n = in.nextInt();
            isPrime = true;
            if (n < 2 || (n > 2 && (n&1) == 0)) System.out.println("Not prime");
            else {
                for (int o = 2; o < (int)Math.sqrt(n); o++) {
                        if (n % o == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (!isPrime) System.out.println("Not prime");
                    else System.out.println("Prime");
                }
        }
    }
}
