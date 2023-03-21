/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
import java.util.Date;
public class DateTimeJAVA {
    
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d=new Date();
        System.out.println(d);
        //ALL METHODS ARE DEPLCATED 
        System.out.println(d.getDate());
        System.out.println(d.getTime());
        System.out.println(d.getYear());
    }
}
