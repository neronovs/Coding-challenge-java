public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //current date
        int dCur = in.nextInt();
        int mCur = in.nextInt();
        int yCur = in.nextInt();
        //expected day
        int dEx = in.nextInt();
        int mEx = in.nextInt();
        int yEx = in.nextInt();
        //difference
        int dDif = dCur - dEx;
        int mDif = mCur - mEx;
        int yDif = yCur - yEx;
        
        int res = 0;
        if (yDif > 0) res = 10000;
        else if (yDif == 0 && mDif > 0) res = mDif * 500;
        else if (yDif == 0 && mDif == 0 && dDif > 0) res = dDif * 15;
        else if (yDif == 0 && mDif == 0 && dDif <= 0) res = 0;

        System.out.println(res);
    }
}
