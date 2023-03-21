/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.TimeZone;

public class Calendar_Java {

    public static void main(String[] args) {
//        Calendar cd=Calendar.getInstance();
//        System.out.println(cd.getCalendarType());
//        System.out.println(cd.getTimeZone());
//        System.out.println(cd.getTime());
//        
        System.out.println("________________>>>>>>>>>>>>>>>>>>>>>>");

        Calendar cd = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        System.out.println(cd.getCalendarType());
        System.out.println(cd.getTimeZone());
        System.out.println(cd.getTime());
        System.out.println(cd.getTimeZone().getID());

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

    }
}
