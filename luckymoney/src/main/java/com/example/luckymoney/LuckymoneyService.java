package com.example.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.math.BigDecimal;

@Service
public class LuckymoneyService {
    @Autowired
    private LuckymoneyRepository repository;

    /*
    *   事务管理
    * */
    @Transactional
    public void createTwo(){
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("彭燎原");
        luckymoney1.setMoney(new BigDecimal(520));
        luckymoney1.setConsumer("陈甸甸");
        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("彭燎原");
        luckymoney2.setMoney(new BigDecimal(1314));
        luckymoney2.setConsumer("陈甸甸");
        repository.save(luckymoney2);

    }
}
