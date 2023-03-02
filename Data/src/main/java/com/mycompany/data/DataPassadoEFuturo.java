package com.mycompany.data;

import java.util.Date;

public class DataPassadoEFuturo {
    public static void main(String[] args) {
        Date datadopassado = new Date(1513124807691L);
        Date datadofuturo = new Date(1613124807691L);
        boolean isAfter = datadopassado.after(datadofuturo);
        System.out.println(isAfter);
        boolean isBefore = datadopassado.before(datadofuturo);
        System.out.println(isBefore);
    }
}
