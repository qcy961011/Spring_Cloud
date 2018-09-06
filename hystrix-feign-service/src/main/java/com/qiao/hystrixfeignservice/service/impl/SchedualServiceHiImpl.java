package com.qiao.hystrixfeignservice.service.impl;

import com.qiao.hystrixfeignservice.service.ISchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiImpl implements ISchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
