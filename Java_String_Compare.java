public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        int k = in.nextInt();
        
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        String maxStr = "";
        String minStr = "";
        
        for (int i = 0; i < str.length()-k+1; i++) {
            
            String tempVal = str.substring(count, count + k);
            if (tempVal.compareTo(maxStr) > max) {
                maxStr = tempVal;
                max = tempVal.compareTo(maxStr);
            }
            if (tempVal.compareTo(minStr) < min) {
                minStr = tempVal;
                min = tempVal.compareTo(minStr);
            }
            if (count < str.length()) count++;
        }
        System.out.println(minStr);
        System.out.println(maxStr);
    }
}
