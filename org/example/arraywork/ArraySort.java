package org.example.arraywork;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args){
        String [] names = {"Indronil","Shawbori", "Shawrbani", "Mukti", "Pronob"};
        Arrays.sort(names);
        System.out.println("Names sorted : " + Arrays.toString(names));

    }
}
