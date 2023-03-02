package com.mycompany.calendario;

import java.util.Calendar;

public class Calendario {

    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        
        System.out.println("A data corrente é " +  agora.getTime());
        
        //diminua ou aumenta a quantidade de dias.
        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atras: " + agora.getTime());
        
        //diminua ou aumenta a quantidade de mês.
        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        
        //diminua ou aumenta a quantidade de ano.
        agora.add(Calendar.YEAR, 2);
        System.out.println("2 ano depois: " + agora.getTime());
    }
}
