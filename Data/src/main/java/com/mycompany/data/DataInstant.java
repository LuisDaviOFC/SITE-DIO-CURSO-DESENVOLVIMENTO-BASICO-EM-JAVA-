package com.mycompany.data;

import java.time.Instant;
import java.util.Date;

public class DataInstant {
    public static void main(String[] args) {
        Date datainicio = new Date(1513124807691L);
        System.out.println(datainicio);
        
        Instant instant = datainicio.toInstant();
        System.out.println(instant);
    }
 
}
