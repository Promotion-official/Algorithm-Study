package if_statement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2884
public class AlarmClock {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("HH mm");
        Date date = sdf.parse(time);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, -45);
        System.out.println(cal.get(Calendar.HOUR_OF_DAY) + " " + cal.get(Calendar.MINUTE));
    }
}
