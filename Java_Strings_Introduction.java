public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len = A.length() + B.length();
        boolean aBigger = false;
        if (A.compareTo(B) > 0) aBigger = true;
        
        String res = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(len);
        if (aBigger) System.out.println("Yes");
        else System.out.println("No");
        System.out.println(res);
    }
}
