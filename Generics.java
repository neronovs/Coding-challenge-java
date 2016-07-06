public class Solution {

    static int count;
    
    public static int[] sorting(int[] a) {
        count = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = 0;
            for (int l = 0; l < a.length-1; l++) {
                if (a[l] > a[l+1]) {
                    count++;
                    temp = a[l+1];
                    a[l+1] = a[l];
                    a[l] = temp;
                }
            }
            if (count == 0) break;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        a = sorting(a);
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }
}
