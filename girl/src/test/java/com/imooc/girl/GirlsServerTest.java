package com.imooc.girl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlsServerTest {

    @Autowired
    private GirlService service;

    @Test
    public void TryTest(){
        Girl gir =service.findOne(12);
        Assert.assertEquals(new Integer(22),gir.getAge() );
    }
}
