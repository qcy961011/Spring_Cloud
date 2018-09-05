package com.qiao.ribbonservice.action;

import com.qiao.ribbonservice.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloControler {
    @Autowired
    IHelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return helloService.hiService(name);
    }
}
