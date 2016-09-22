public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        String res = "";
        int sLen = s.length();
        long size = 0;
        if (sLen > 1) {
            
            int count = 0;
            char[] inputChars = s.toCharArray();
            int len = inputChars.length;
            for (int i = 0, j = 0; i < n; i++, j++)
            {
              char thisChar = inputChars[j];
              if (thisChar == 'a')
                count++;
              if (j == len - 1)
                j = -1;
            }
            System.out.println(count);
            
        } else if (sLen == 1) {
            if (s.substring(0).equals("a")) System.out.println(n);
            else System.out.println("0");
        }
    }
}
