package com.company;

public class Main {

    public static void main(String[] args) {
	// separaNegativosPositivos
        int[] a = {4, -5, 1, -8, 2, -1};
        escribeArray(a);
        escribeArray(separaNegativosPositivos(a));
        //
        int[] b = {5, 2, -1, -2};
        escribeArray(b);
        escribeArray(separaNegativosPositivos(b));
        System.out.println("El array original no se toca:");
        escribeArray(b);
    }

    public static int[] separaNegativosPositivos(int[] array)
    {
        int cont = 0;
        int aux, i, j;
        int[] array2 = new int[array.length];
        for(j = 0; j < array.length; j++)
        {
            array2[j] = array[j];
        }
        for (i = 0; i < array2.length; i++)
        {
            if(array2[i] < 0)
            {
                for (j = i; j > cont; j--)
                {
                    aux = array2[j];
                    array2[j] = array2[j - 1];
                    array2[j - 1] = aux;
                }
                cont++;
            }
        }
        return array2;
    }

    public static void escribeArray(int[] a) {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length - 1; i++) {
            System.out.print(a[i]);
            System.out.print(", ");
        }
        System.out.print(a[a.length - 1]);
        System.out.println("]");
    }
}
