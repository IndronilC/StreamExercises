package org.example.reactors;

import java.util.Arrays;
import java.util.List;

public class PrintAllCharactersOfName {
    public static void main (String[] args){
        List<String> fruits = Arrays.asList("Banana", "Guava", "Orange", "Apple", "Peach" );
        printAllNamesOfFruitsStartingFromFirstLetterByLoop(fruits);
    }
    private static void printAllNamesOfFruitsStartingFromFirstLetterByLoop(List<String> fruits){
        StringBuffer stringBuffer = new StringBuffer();
        for(String fruit : fruits){
            stringBuffer.append(fruit.substring(0,1));
        }
        for(String fruit : fruits){
            if(fruit.length() >= 1) {
                stringBuffer.append(fruit.substring(1, 2));
            }
        }

        for(String fruit : fruits){
            if(fruit.length() >= 2) {
                stringBuffer.append(fruit.substring(2, 3));
            }
        }

        System.out.print(stringBuffer.toString());
    }
}
