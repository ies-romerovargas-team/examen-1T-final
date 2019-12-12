package com.company;

public class Main {

    public static void main(String[] args) {
	// elementosComunes3
        int[] array1 = {1, 3, 5, 7, 10, 15, 20, 25, 30, 35, 40};
        int[] array2 = {2, 3, 4, 5, 6, 7, 25};
        int[] array3 = {1, 2 ,3, 4, 5, 25};
        elementosComunes3(array1, array2, array3);
    }

    public static void elementosComunes3(int[] a1, int[] a2, int[] a3)
    {
        int i;
        int cont = 0;
        int[] aux = new int[a1.length];
        for(i = 0; i < a1.length; i++)
        {
            if(contiene(a2, a1[i]))
            {
                if(contiene(a3, a1[i]))
                {
                    if(!contiene(aux, a1[i]))
                    {
                        aux[cont] = a1[i];
                        cont++;
                        System.out.print(a1[i] + " ");
                    }
                }
            }
        }
    }

    private static boolean contiene(int[] array, int a)
    {
        int i;
        for (i = 0; i < array.length; i++) {
            if(array[i]==a) return true;
        }
        return false;
    }
}
