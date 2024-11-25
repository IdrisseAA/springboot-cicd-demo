package com.kmicts.sbcicd;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/", produces = MediaType.APPLICATION_JSON_VALUE)
public class SaController {

    @GetMapping("sa")
    public List<Object> search (){
        return List.of(new Sa(1, "Belle Formation", 1));
    }

    @GetMapping("welcome")
    public String welcome (){
        return "Welcome to this ci cd demo";
}

}
