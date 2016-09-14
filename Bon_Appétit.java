public class Solution {

    public static void main(String[] args) {
        int res = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }
        int b = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (i != k) res += c[i];
        }

        if (res/2 == b) System.out.println("Bon Appetit");
        else System.out.println(b - res/2);
    }
}
