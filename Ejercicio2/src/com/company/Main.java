package com.company;

public class Main {

    public static void main(String[] args) {
	// separaNegativosPositivos
        int[] array1 = {4, -5, 1, -8, 2, -1};
        escribeArray(array1);
        escribeArray(separaNegativosPositivos(array1));
        //
        int[] array2 = {5, 2, -1, -2};
        escribeArray(array2);
        escribeArray(separaNegativosPositivos(array2));
    }

    public static int[] separaNegativosPositivos(int[] array)
    {
        int cont = 0;
        int aux, i, j;
        for (i = 0; i < array.length; i++)
        {
            if(array[i] < 0)
            {
                for (j = i; j > cont; j--)
                {
                    aux = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = aux;
                }
                cont++;
            }
        }
        return array;
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
