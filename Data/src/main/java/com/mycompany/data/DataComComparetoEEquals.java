package com.mycompany.data;

import java.util.Date;

public class DataComComparetoEEquals {
    public static void main(String[] args) {
        Date datadopassado = new Date(1513124807691L);
        Date datadofuturo = new Date(1613124807691L);
        Date mesmadatadofuturo = new Date(1613124807691L);
        
        /**Comparando se as datas são iguais*/
        boolean isEquals = datadofuturo.equals(mesmadatadofuturo);
        System.out.println(isEquals);
        
        /**Comparando uma data com a outra*/
        int comparecase1 = datadopassado.compareTo(datadofuturo);
        int comparecase2 = datadofuturo.compareTo(datadopassado);
        int comparecase3 = datadofuturo.compareTo(mesmadatadofuturo);
        
        System.out.println(comparecase1);
        System.out.println(comparecase2);
        System.out.println(comparecase3);
    }
}
