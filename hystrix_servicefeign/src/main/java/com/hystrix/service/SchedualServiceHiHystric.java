package com.hystrix.service;

import org.springframework.stereotype.Component;

/**
 * Created by test on 8/2/17.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHi(String name){
        return "sorry, hystrix "+name;
    }
}
