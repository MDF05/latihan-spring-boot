package com.example.latihan.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/latihan")
@RequiredArgsConstructor
public class LatihanController {


    @GetMapping
    public static List<String> getData() {
        List<String> ListString =  new ArrayList<String>();
        ListString.add("asu");
        ListString.add("asu2");

        return ListString;
    }
}
