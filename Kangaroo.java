public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        boolean yes = false;
        
        if (x1 < x2 && v1 >= v2) {
            while (x1 < x2) {
                if (x1 + v1 == x2 + v2) {
                    yes = true;
                    break;
                }
                x1 += v1;
                x2 += v2;
            }
        }
        
        if (yes) System.out.println("YES");
        else System.out.println("NO");
    }
}
