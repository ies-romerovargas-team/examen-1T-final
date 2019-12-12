package com.company;

public class Main {

    public static void main(String[] args) {
	// graficaBarras
        int[] notas = {4, 8, 9, 1, 5, 5, 6, 0, 2};
        graficaBarras(notas);
    }

    public static void graficaBarras(int[] a)
    {
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";
        boolean valido = true;
        int i, j;
        for (i = 0; i < a.length; i++) {
            if (a[i]<0 || a[i]>9)
            {
                valido = false;
                System.out.println("Error: valores no válidos.-");
            }
        }
        if(valido)
        {
            for (i = 9; i > 0; i--) {

                for (j = 0; j < a.length; j++) {
                    if(a[j] >= i)
                    {
                        if(a[j] >= 5){
                            System.out.print(ANSI_GREEN);
                        }
                        else
                        {
                            System.out.print(ANSI_RED);
                        }
                        System.out.print("█ ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.print(ANSI_RESET);
            for (i = 0; i < a.length; i++)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}
