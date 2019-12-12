package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// cuentaDiptongos
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una cadena: ");
        String a = sc.nextLine();
        System.out.println("Diptongos: " + cuentaDiptongos(a));
    }

    public static int cuentaDiptongos(String cadena)
    {
        String[] diptongos = {"ia", "iá", "ie", "ié", "io", "ió", "ua", "uá", "ue", "ué", "üe", "uo", "uó",
                              "oy", "ai", "ái", "ei", "éi", "oi", "ói", "au", "áu", "eu", "éu", "ou", "óu",
                              "ahi", "ahe", "ahu"};
        String aux = "";
        int i, j;
        int cont = 0;

        for (i = 0; i < cadena.length()-1; i++) {
            for (j = 0; j < diptongos.length; j++)
            {
                aux = cadena.substring(i, i + 2);
                // excepcion h intercaladas
                if(aux.equals("ah") && i < cadena.length()-2)
                {
                    aux = aux + cadena.charAt(i + 2);
                }
                if(aux.equals(diptongos[j]))
                {
                    // Excepción u muda
                    if(diptongos[j].equals("ue") && i > 0)
                    {
                        if(cadena.charAt(i-1)!= 'q' && cadena.charAt(i-1)!= 'g')
                        {
                            cont++;
                        }
                    } else cont++;
                }
            }
        }
        return cont;
    }
}
