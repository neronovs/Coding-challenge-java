public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int max = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i+1; j <= n; j++) {
                    int temp = i & j;
                    if (temp < k && temp > max) max = temp;
                }
            }
            System.out.println(max);
        }
    }
}
