package com.prkat.mangomatters;
import com.prkat.mangomatters.model.Orchard;
import com.prkat.mangomatters.service.OrchardServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrchardController {
    @Autowired
    OrchardServiceIml orchardServiceIml;

    @GetMapping("/mangoes")
    public String myMessage(String m) {

        return "ShowListofMangos";

    }

    @PostMapping(path = "/orchard", consumes = "application/json", produces = "application/json")
    public HttpStatus addOrchard(@RequestBody Orchard orchard) {

        return  orchardServiceIml.addOrchard(orchard)?HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }

    @GetMapping(path = "/allorchards")
    public List<Orchard> getAll(){
        return orchardServiceIml.getAllOrchidDetails();
    }

    @DeleteMapping(path="/orchard/{id}")
    public HttpStatus deleteOrchard(@PathVariable Orchard orchardId){
      orchardServiceIml.deleteOrchard(orchardId);
        return HttpStatus.NO_CONTENT;
    }

    }
