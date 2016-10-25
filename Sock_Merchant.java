public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        sort(c, n);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (i < n-1) {
                if (c[i] == c[i + 1]) {
                    res++;
                    i++;
                }
            }
        }
        System.out.println(res);
    }
    
    public static void sort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int o = i+1; o < n; o++) {
                int temp = 0;
                if (arr[o] < arr[i]) {
                    temp = arr[o];
                    arr[o] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
