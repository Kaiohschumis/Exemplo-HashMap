package com.entra21.java;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> idades= new HashMap<>();
        idades.put("Cleiton", 22);
        idades.put("Kleyton", 24);

        if(idades.containsKey("Kreytom")){
            System.out.println("TEM KREYTOM");
        } else {
            System.out.println("NÃO TEM KREYTOM");
        }

        // PEga o valor de acordo com a chave
        int idade = idades.get("Kleytom");
        System.out.println("Idade do Kleytom: " + idade);
        // altera o valor daquela chave
        idades.put("Kleyton", 27);

        // remove o valor de acordo com a key
        idades.remove("Kleyton");
    }
}