package com.imooc.girl;

import com.imooc.girl.util.Result;
import com.imooc.girl.util.ResultMap;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class GrilController {

    private final static Logger logger = LoggerFactory.getLogger(GrilController.class);

    @Autowired
    private GirlRepository repository;

    @Autowired
    private  GirlService girlService;

    /*
    * 查找所有对象
    * */
    @PostMapping(value = "/girlsfind")
    public List<Girl> findAl(){
        logger.info("findAll");
        return repository.findAll();
    }

    /*
    *   新增一个对象
    * */
        @GetMapping(value = "addgirl")
    public Result<Girl> addgirl(@Valid Girl girl , BindingResult bindingResult ){
    if(bindingResult.hasErrors()){
        return  ResultMap.error(1,bindingResult.getFieldError().getDefaultMessage())  ;
    }
        return ResultMap.sucess(repository.save(girl));
    }

    /*
    *   删除一个对象
    * */
    @GetMapping(value = "delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
        logger.info("sucess");
        findAl();
    }

    /*
    *   查询特定女生
    * */

    @PostMapping(value ="findgirl/{id}" )
    public Girl findById(@PathVariable("id") Integer id){
        return   repository.findById(id).orElse(null);

    }

    /*
    *   通过年龄查询女生
    * */
    @GetMapping(value = "findByAge/{age}")
    public List<Girl> findByAge(@PathVariable("age") Integer age){
        return repository.findByAge(age);
    }

    /*
    *       更新
        * */
@PostMapping(value = "update/{id}")
    public Girl update(@PathVariable("id") Integer id,
                       @RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age,
                       @RequestParam("money") Double money
                       ){
            Girl girl = new Girl();
            girl.setCupSize(cupSize);
            girl.setAge(age);
            girl.setMoney(money);
            girl.setId(id);
            return  repository.save(girl);
    }

    /*
    *
    * */

    @PostMapping(value = "getAge/getage/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception {
         girlService.getAge(id);
         //girlService.findOne(id);
    }
}
