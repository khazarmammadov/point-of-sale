package com.shopping.pos.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class Test {


    @GetMapping()
    public String test() {
        return "test";
    }
}


