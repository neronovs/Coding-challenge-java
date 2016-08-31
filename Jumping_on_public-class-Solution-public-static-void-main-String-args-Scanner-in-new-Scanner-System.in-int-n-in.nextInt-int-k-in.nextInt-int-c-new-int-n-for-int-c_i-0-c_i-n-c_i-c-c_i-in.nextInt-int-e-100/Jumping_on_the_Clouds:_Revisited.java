public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int e = 100; //energy. -1 for an every move. -2 if a cloud is thunder one
        for (int i = 0; i < n; i += k) {
            if (c[i] == 1) e -= 3;
            else e -= 1;
        }
        
        System.out.println(e);
    }
}
