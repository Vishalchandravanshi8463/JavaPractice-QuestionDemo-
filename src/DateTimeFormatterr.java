/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatterr {
    
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy--E a");
        String muDate=dt.format(dtf);
        System.out.println(muDate);
        
    }

//    private static DateTimeFormatter ofPattern(String ddMMyyyy) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
