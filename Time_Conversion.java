import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
                String timeHourStr = "";
        String time24 = time.substring(0, 8);
        String amPm = time.substring(8, 10);
        int timeHour = Integer.parseInt(time24.substring(0, 2));
        
        time24 = time24.substring(2, 8);
        if (!amPm.equals("AM")) {
            if ((amPm != "PM" && timeHour != 12) && (amPm != "AM" && timeHour != 12)){
                timeHourStr = Integer.toString(timeHour + 12);
            }
        } else timeHourStr = Integer.toString(timeHour);
        if (timeHour < 10 && amPm.equals("AM")) timeHourStr = "0" + timeHourStr;
        if (amPm.equals("AM") && timeHour == 12) {
            timeHourStr = "00";
        }
        else if (amPm.equals("PM") && timeHour == 12) {
            timeHourStr = "12";
        }
        time24 = timeHourStr + time24;
        System.out.println(time24);
    }
}
