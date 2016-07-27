public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        boolean palindrome = true;
        for (int i = 0; i < A.length()/2; i++) {
            //System.out.println("Letter " + (A.substring(i, i+1) + ", letter " + A.substring(A.length()-(i+1), A.length()-(i))));
            String left = A.substring(i, i+1);
            String right = A.substring(A.length()-(i+1), A.length()-(i));
            if (!left.equals(right)) {
                palindrome = false;
                break;
            } 
        }
        
        if (palindrome) System.out.println("Yes");
        else System.out.println("No");
    }
}
