package org.example.arraywork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListSortedUsingStreams {
    public static void main(String[] args){
        List<String> namesList = Arrays.asList("Indronil", "Shawnda", "Puchchu",
                "Shawrbani", "Shawbori", "Mukti", "Pronob");
        // In fact toList could be imported as a static method
        // which is the standard best practice that is used
        // But Being playground code, I have not done that
        List<String> sortedNamesList = namesList.stream().sorted().collect(Collectors.toList());
        sortedNamesList.stream().forEach(System.out::println);

    }
}
