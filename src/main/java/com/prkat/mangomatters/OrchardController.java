package com.prkat.mangomatters;

import com.prkat.mangomatters.model.OrchardDto;
import com.prkat.mangomatters.model.Orchard;
import com.prkat.mangomatters.service.OrchardServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrchardController {
    @Autowired
    OrchardServiceIml orchardServiceIml;

    @GetMapping("/mangoes")
    public String myMessage(String m) {

        return "ShowListofMangos";


    }

    @PostMapping(path = "/addOrchad", consumes = "application/json", produces = "application/json")
    public OrchardDto saveOrchardDetails(@RequestBody OrchardDto orchard) {
        if (null != orchard) {
            return orchardServiceIml.saveOrchardService(orchard);
        }


    }
}
