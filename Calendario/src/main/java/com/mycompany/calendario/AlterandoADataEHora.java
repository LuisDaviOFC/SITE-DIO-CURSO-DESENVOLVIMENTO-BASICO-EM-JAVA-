package com.mycompany.calendario;

import java.util.Calendar;

public class AlterandoADataEHora {
        public static void main(String[] args) {
        Calendar agora =  Calendar.getInstance();
            
            //Exemplo 1
            System.out.printf("%tc\n", agora);
            
            //Exemplo 2
            System.out.printf("%tF\n", agora);
            
            //Exemplo 3
            System.out.printf("%tD\n", agora);
            
            //Exemplo 4
            System.out.printf("%tr\n", agora);
            
             //Exemplo 5
            System.out.printf("%tT\n", agora);
    }
}
