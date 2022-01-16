/*
 * 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String [] args){
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        calendar.add(Calendar.HOUR, -9);
        String res = dateFormat.format(calendar.getTime());
        System.out.println(res);
    }
}