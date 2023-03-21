/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class DateTimeLocal {
    public static void main(String[] args) {
        LocalTime time= LocalTime.now();
        System.out.println(time);
         LocalDate Date= LocalDate.now();
        System.out.println(Date);
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);
    }
}
