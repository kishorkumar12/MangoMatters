package com.prkat.mangomatters;

import com.prkat.mangomatters.model.Variety;
import com.prkat.mangomatters.service.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VarietyController {
    @Autowired
    VarietyService varietyService;
    @GetMapping("/mangoes1")
    public String myMessage(String m) {
        return "ShowListofMangos";

    }
    @PostMapping(path = "/variety", consumes = "application/json", produces = "application/json")
    public HttpStatus addVariety(Variety variety) {
        return  varietyService.addVariety(variety)?HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }


}
