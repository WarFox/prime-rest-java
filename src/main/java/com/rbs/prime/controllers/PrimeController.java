package com.rbs.prime.controllers;

import com.rbs.prime.PrimeNumber;
import com.rbs.prime.models.PrimeResponse;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PrimeController {

    @RequestMapping(value = "/primes")
    public PrimeResponse list() {
        return list(10);
    }

    @RequestMapping(value = "/primes/{limit}")
    public PrimeResponse list(@PathVariable int limit) {
        return new PrimeResponse(limit, PrimeNumber.primeNumbers(limit));
    }


}
