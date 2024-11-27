package com.example.demo.person.controller

import com.example.demo.person.model.Person
import com.example.demo.person.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/people")
class PersonController(
    //@Autowired 생략가능
    private val personService: PersonService // 생성자에서 PersonService를 주입하는 것이 권장된다
) {

//    @Autowired
//    lateinit var personService: PersonService

    // Mono : 단일 객체를 비동기적으로 반환
    @GetMapping("/single")
    fun getPerson(): Mono<Person> {
        return personService.getPerson()
    }

    // Flux : 여러 개의 객체를 비동기적으로 반환
    @GetMapping("/all")
    fun getAllPeople(): Flux<Person> {
        return personService.getAllPeople()
    }
}