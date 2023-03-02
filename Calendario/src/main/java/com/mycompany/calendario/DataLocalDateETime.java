package com.mycompany.calendario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataLocalDateETime {
    public static void main(String[] args) {
        
        //Metodo 1
        LocalDate dataagora = LocalDate.now();
        System.out.println("Data e Hora");
        LocalTime horaagora = LocalTime.now();
        
        System.out.println("A data e a hora de hoje: " + dataagora + " e "  +horaagora);
        
        //Metodo 2
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data e Hora");
        System.out.println(agora);
    }
}
