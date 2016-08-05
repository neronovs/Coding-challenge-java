public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //Count of intege numbers in an array
        int K = in.nextInt(); //The shift of the array
        int Q = in.nextInt(); //A number of the indexes of the array to show what is inside
        int A[] = new int[N];
        
        //make a shifting
        for(int i = 0; i < N; i++) {
          A[(i + K) % N] = in.nextInt();
        }
        for(int i = 0; i < Q; i++) {
           System.out.println(A[in.nextInt()]);
        }
    }
}
