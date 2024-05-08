package org.example.dockerdemo.controller;

import org.example.dockerdemo.entity.DemoEntity;
import org.example.dockerdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping
    public List<DemoEntity> findAll(){
        return demoService.findAll();
    }

    @PostMapping
    public DemoEntity save(@RequestBody DemoEntity entity){
        return demoService.save(entity);
    }

    @GetMapping("/id")
    public DemoEntity findById(@RequestParam int id){
        return demoService.findById(id).get();
    }
}
