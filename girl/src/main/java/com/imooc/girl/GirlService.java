package com.imooc.girl;

import com.imooc.girl.handle.GirlException;
import net.bytebuddy.implementation.bytecode.Throw;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class  GirlService {

        private static Logger logger = LoggerFactory.getLogger(GirlService.class);
    @Autowired
    private  GirlRepository repository;

    public void getAge(Integer id) throws Exception {
              List<Girl> girl1= repository.findAll();
              for(int i=0;i<girl1.size();i++){
                  if(id == girl1.get(i).getId()){
                      Optional<Girl> girl= repository.findById(id);
                      System.out.println(girl.get().getCupSize());
                      int age = girl.get().getAge();
                      if(age<12){
                          throw new GirlException(ResultEnum.PRIMARY_SCHOOEL);
                      }else if(age >=12 && age <=16){
                          throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
                      }else {
                          throw  new GirlException(ResultEnum.MAN_SCHOOL);
                      }
                  }
              }
            throw  new GirlException(ResultEnum.NO_USER);
    }

    /*
    *   通过id查询一个女生的信息
    * */
    public Girl findOne(Integer id) {
       return repository.findById(id).orElse(null);
    }
}
