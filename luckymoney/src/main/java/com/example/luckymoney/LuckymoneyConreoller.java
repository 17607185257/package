package com.example.luckymoney;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class LuckymoneyConreoller {
    @Autowired
    private LuckymoneyService luckymoneyService;
    @Autowired
    private LuckymoneyRepository repository;
    /*
    *   获取红包列表
    * */
    @GetMapping("/luckymoneys")
    public List<Luckymoney> list(){
        return repository.findAll();
    }

    /*
    *   发送红包
    * */
    @PostMapping("/creatluckmoneys")
    public Luckymoney creat(@RequestParam("producer" ) String productor,
                             @RequestParam("money" ) BigDecimal money,
                             @RequestParam("consumer" ) String  consumer){
        Luckymoney luckymoney = new Luckymoney();
        luckymoney.setProducer(productor);
        luckymoney.setMoney(money);
        luckymoney.setConsumer(consumer);
        return repository.save(luckymoney);
    }

    /*
    *   查找红包记录
    * */
   /* @GetMapping("/findLuckymoney/{id}")
    public Luckymoney find(@PathVariable("id") Integer id){
        return repository.findById(id).orElse(null);
    }*/
    @GetMapping("/findLuckymoney")
    public Luckymoney find(@RequestParam("id") Integer id){
        return repository.findById(id).orElse(null);
    }

    /*
    *   更新红包记录
    * */
    @GetMapping("/updateLuckMoney/{id}")
    public Luckymoney update(@PathVariable("id") Integer id,
                             @RequestParam("consumer" ) String  consumer,
                             @RequestParam("producer" ) String productor,
                             @RequestParam("money" ) BigDecimal money){
       Optional<Luckymoney> optional =  repository.findById(id);
       if(optional.isPresent()) {
           Luckymoney luckymoney = optional.get();
           luckymoney.setId(id);
           luckymoney.setConsumer(consumer);
           luckymoney.setProducer(productor);
           luckymoney.setMoney(money);
           return repository.save(luckymoney);
       }
       return null;
    }

    @PostMapping("/creatluckmoneys/two")
    public void Two(){
        luckymoneyService.createTwo();
    }
}
