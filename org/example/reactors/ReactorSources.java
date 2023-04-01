package org.example.reactors;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class ReactorSources {

    public static Flux<String> getNumbersInFlux(){
       return Flux.just("one", "two", "three", "four", "five")
                .delayElements(Duration.ofSeconds(1));

    }
}
