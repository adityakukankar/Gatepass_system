package com.management.gatepass.Controller;

import com.management.gatepass.Entity.GatepassDetails;
import com.management.gatepass.Services.GatepassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;

//TODO - suggestion on api names
//TODO to decide, will need more api or not.

@RestController()
@RequestMapping("/gatepass/v1")
public class GatepassController {

    @Autowired
    private GatepassService gatepassService;

    //TODO
    @GetMapping(value = "/alldetails")
    @ResponseBody
    public Iterable<GatepassDetails> listAllDetails() {
        return gatepassService.listAllDetails();
    }

    @GetMapping(value ="/{id}")
    @ResponseBody
    public ResponseEntity<GatepassDetails> fetchDetailsById(@PathVariable String id) throws IOException {
        Optional<GatepassDetails> gatepassDetails = gatepassService.findDetailsById(id);
        return new ResponseEntity<>(gatepassDetails.orElse(null), HttpStatus.OK);
    }
    //TODO
/*    @GetMapping(value ="/{id}/", produces = "application/json", consumes = "application/json")
    @ResponseBody
    public void fetchStatus(@PathVariable String id){
    }

    @PostMapping(value = "/abc", produces = "application/json", consumes = "application/json")
    public void setStatus(){
    }*/
}
