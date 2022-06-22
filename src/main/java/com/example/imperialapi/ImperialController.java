package com.example.imperialapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialController {

    Converter converter = new Converter();

    @RequestMapping("/InToCm")
    public double InchToCm(@RequestParam double inch){
        return converter.InchToCm(inch);
    }

    @RequestMapping("/YdToM")
    public double YardToMeter(@RequestParam double yard){
        return converter.YardToMeter(yard);
    }
}
