package com.management.gatepass.Controller;

import com.management.gatepass.Entity.GatepassEntity;
import com.management.gatepass.Services.GatepassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//TODO - suggestion on api names
//TODO to decide, will need more api or not.

@RestController(value = "/iocl/gatepass")
public class ConnectController {

    @Autowired
    private GatepassService gatepassService;

    @GetMapping(value ="/{id}/", produces = "application/json", consumes = "application/json")
    @ResponseBody
    public String fetchStatus(@PathVariable String id){
        return gatepassService.fetchStatusByID(id);
    }

    //TODO apis not completed
    @PostMapping(value = "", produces = "application/json", consumes = "application/json")
    @RequestMapping
    public void setStatus(){
    }

    @PostMapping(value = "", produces = "application/json", consumes = "application/json")
    @RequestMapping
    public void saveData(@RequestBody GatepassEntity gatepassEntity){
    }
}
