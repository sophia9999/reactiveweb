package com.example.demo.person.service

import com.example.demo.person.model.Person
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class PersonService {

    fun getPerson(): Mono<Person> {
        return Mono.just(Person("Alice", 20))
    }

    fun getAllPeople(): Flux<Person> {
        return Flux.just(
            Person("Alice", 20),
            Person("Bob", 40),
            Person("Carol", 14),
            Person("Sophia", 34)
        )
    }
}