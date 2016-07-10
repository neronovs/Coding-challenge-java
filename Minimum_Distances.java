public class Solution {

    public static void getMinLength(int[] A) {
        
        ArrayList<Integer> dif = new ArrayList();
        for (int i = 0; i < A.length - 1; i++) {
            for (int o = i + 1; o < A.length; o++) {
                if (A[o] == A[i]) {
                    dif.add(Math.abs(i - o));
                }
            }
        }
        Collections.sort(dif);
        
        if (dif.size() > 0) System.out.println(dif.get(0));
        else System.out.println("-1");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        
        getMinLength(A);
    }
}
