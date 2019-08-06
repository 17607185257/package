package com.example.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

  /*  @GetMapping("/say/{id}")
    public String say(@PathVariable("id") Integer id){
     //   return  "i hope i can  "+ limitConfig.getMinMoney() + " , 说明 "+limitConfig.getDesccription();
        return "id: "+id;
   } */


    @GetMapping("/say")
    public String say(@RequestParam(value = "id" ,required = false,defaultValue = "0") Integer id){
        //   return  "i hope i can  "+ limitConfig.getMinMoney() + " , 说明 "+limitConfig.getDesccription();
        return "id: "+id;
    }

    /*@GetMapping("/say")
    public String say(){
        return  "i hope i can  "+ limitConfig.getMinMoney() + " , 说明 "+limitConfig.getDesccription();
        // return "id: "+id;
    }*/
}
