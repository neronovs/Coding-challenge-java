public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        date.setYear(Integer.parseInt(year));
        date.setMonth(Integer.parseInt(month));
        date.setDate(Integer.parseInt(day));
        cal.set(Integer.valueOf(year),Integer.valueOf(month) -1, Integer.valueOf(day));
        String[] strDays = new String[] { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        System.out.println(strDays[cal.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
