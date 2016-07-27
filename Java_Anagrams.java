public class Solution {
  static boolean isAnagram(String a, String b) {
        char[] arrA = new char[a.length()];
        char[] arrB = new char[b.length()];
        boolean res = true;
        
        if (a.length() != b.length()) return false;

        arrA = a.toLowerCase().toCharArray();
        arrB = b.toLowerCase().toCharArray();
        
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] != arrB[i]) {
                res = false;
                break;
            }
        }
        return res;
    }
        public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
