package com.prkat.mangomatters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    String name ="All Mangoes are sold now,Wait for few minites";

    @GetMapping("/mangoes")
    public String myMessage(String m) {

        return "ShowListofMangos";


    }


}
