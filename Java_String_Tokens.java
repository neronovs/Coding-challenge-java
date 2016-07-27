public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        if (s.trim().length() > 400000 || s.trim().length() == 0) System.out.println(0);
        else {
            String[] arr = s.trim().split("[_ !,?.'@]+"); //!,?._'@
            System.out.println(arr.length);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
