package com.qiao.hystrixservice.action;


import com.qiao.hystrixservice.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @Autowired
    IHelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return helloService.hiService(name);
    }
}
