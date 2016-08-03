class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int ii=0;ii<t;ii++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = 0;
            
            for (int el = 0; el < n; el++) {
                res = a;
                for (int i = 0; i <= el; i++) {
                    res += ((int)(Math.pow(2, i) * b));
                }
                System.out.print(res + " ");
            }
            System.out.println("\r");
        }
        in.close();
    }
}
