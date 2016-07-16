public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        //1. Try to jump on the 2d cloud
        //2. If the 1st impos. then jump to 1st cloud
        //6
        //0 0 0 1 0 0
        int times = 0;
        for (int i = 0; i < n; i++) {
            if (i + 2 < n) {
                if (c[i + 2] == 0) i++;
                times++;
            } else if (i + 1 < n) {
                times++;
            }
        }
        System.out.println(times);
    }
}
