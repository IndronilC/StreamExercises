package org.example.reactors;

import reactor.core.publisher.Flux;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class ReactorExample {
    public static void main(String[] args) throws IOException {
        List<Integer> integerList = new ArrayList<Integer>();
        Flux.just(1,2,3,4).log().subscribe(integerList::add);
        System.out.println(integerList);
        System.in.read();
    }
}
