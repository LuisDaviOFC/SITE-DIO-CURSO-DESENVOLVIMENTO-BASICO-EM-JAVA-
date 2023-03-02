package com.mycompany.data;

import java.util.Date;

public class Data {

    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();
        Date datadofuturo = new Date(1077829923346L);
        System.out.println(datadofuturo);
        System.out.println(currentTimeMillis);
        Date novaData =  new Date(currentTimeMillis);
        System.out.println(novaData);

    }
}
