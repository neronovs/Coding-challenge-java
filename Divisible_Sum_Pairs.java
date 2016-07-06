public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int l = i+1; l < n; l++) {
                if ((a[i] + a[l]) % k == 0) count++;
            }
        }
        
        System.out.println(count);
    }
}
