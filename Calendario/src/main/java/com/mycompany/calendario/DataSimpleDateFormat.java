package com.mycompany.calendario;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataSimpleDateFormat {
    public static void main(String[] args) {
        Date agora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);
    }
}