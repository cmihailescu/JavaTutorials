package com.ness.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by P3700453 on 11/18/2016.
 */
public class Lab1 {
    static Integer[] my_array = {99,96,100,-10,99};

    public static void main(String[] args) {
       /* if (my_array.length == 0)
            System.out.println("Array-ul nu contine nici un element.");*/
        /*else
            for (int i = 0; i < my_array.length; i++)
                if (my_array[i] == null){
                    System.out.println("Array-ul contine elemente null.");}*/

        try {
            System.out.println("Valoarea minima este: " + findMin(my_array));
            System.out.println("Media aritmetica este: " + medArit(my_array));
            System.out.println("Indecsii la care gasim valori mai mari decat media aritmetica sunt: " + getInd(my_array));
            System.out.println("Valoarea maxima este: " + findMax(my_array));
            Arrays.sort(my_array);
            System.out.println("Primul element in array-ul aranjat crescator este: " + my_array[0]);
            System.out.println("Valoarea maxima apare de " + findNoMax(my_array) + " ori");
            System.out.println("Exista elemente duplicate: " + findDuplicates(my_array));
        } catch (NullPointerException e) {
            System.out.println("null");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index");
        }
    }


    public static int findMin(Integer[] my_array) {
        int min_val;
        min_val = my_array[0];

        for (int i = 1; i < my_array.length; i++) {
            if (my_array[i] < min_val)
                min_val = my_array[i];
        }


        return min_val;
    }


    public static float medArit(Integer[] my_array) {
        float medie;
        int suma;
        suma = my_array[0];
        for (int i = 1; i < my_array.length; i++)
            suma = suma + my_array[i];

        medie = suma / my_array.length;
        return medie;
    }


    public static List getInd(Integer[] my_array) {

        List<Integer> lista_indecsi = new ArrayList<Integer>();

        float medie = medArit(my_array);
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] > medie)
                lista_indecsi.add(i);

        }
        return lista_indecsi;
    }


    public static Integer findMax(Integer[] my_array) {
        int max_val;
        max_val = my_array[0];
        for (int i = 1; i < my_array.length; i++) {
            if (my_array[i] > max_val)
                max_val = my_array[i];
        }


        return max_val;
    }

    public static Integer findNoMax(Integer[] my_array) {
        int no_max = 0;
        int i;
        int max_val = findMax(my_array);
        for (i = 0; i < my_array.length; i++)
            if (my_array[i] == max_val) {
                no_max++;
            }
        return no_max;
    }

    public static boolean findDuplicates(Integer[] my_array) {
        int i;
        int j;
        for (i = 0; i < my_array.length; i++)
            for (j = i + 1; j < my_array.length - 1; j++) {
                if (my_array[i] == my_array[j])
                    return true;

            }
        return false;
    }

}