package com.prkat.mangomatters;

import com.prkat.mangomatters.model.Variety;
import com.prkat.mangomatters.service.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VarietyController {
    @Autowired
    VarietyService varietyService;
    @GetMapping("/mangoes1")
    public String myMessage(String m) {
        return "ShowListofMangos";

    }
    @PostMapping(path = "/variety", consumes = "application/json", produces = "application/json")
    public HttpStatus addVariety(@RequestBody Variety variety) {
        return  varietyService.addVariety(variety)?HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }

   @GetMapping(path = "/allVariety")
    public List<Variety> getAll(){
        return varietyService.getAllVarities();
    }

    @DeleteMapping("/variety/{varietyId}")
    public HttpStatus deleteOrchard(@PathVariable long varietyId) {
        varietyService.deleteById(varietyId);
        return HttpStatus.NO_CONTENT;
    }

    @PutMapping("/variety/{varietyId}")
    public  HttpStatus updateOrchard(@RequestBody Variety variety){
        varietyService.updateVariety(variety);
        return HttpStatus.NO_CONTENT;

    }

}
