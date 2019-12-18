package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// palabrasImpares
        String a = "El perro de San Roque no tiene rabo";
        System.out.println(a);
        System.out.println(palabrasImpares(a));
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una cadena: ");
        a = sc.nextLine();
        System.out.println(palabrasImpares(a));
    }

    public static String palabrasImpares(String cadena)
    {
        String devuelve = "";
        String[] palabras = cadena.split(" ");
        int i;
        for (i = 0; i < palabras.length; i++)
        {
            if(palabras[i].length()%2==1)
            {
                devuelve = devuelve + palabras[i] + " ";
            }
        }
        return devuelve;
    }
}