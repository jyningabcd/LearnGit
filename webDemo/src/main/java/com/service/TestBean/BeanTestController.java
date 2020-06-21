package com.service.TestBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jyning on 2020/6/16.
 */
@Controller
@ResponseBody
public class BeanTestController {
    @Autowired
    private SingleBean singleBean;
    @Autowired
    private PrototypeBean prototypeBean;
    @Autowired
    private RequestBean requestBean;
    @Autowired
    private SessionBean sessionBean;

    @RequestMapping(value = "/tom",method = RequestMethod.GET)
    public String test(){

        print();
        return "HELLO";
    }

    public void print(){
        System.out.println("singleBean:"+singleBean);
        System.out.println("singleBean:"+singleBean);
        System.out.println("prototypeBean:"+prototypeBean);
        System.out.println("prototypeBean:"+prototypeBean);
        System.out.println("requestBean:"+requestBean);
        System.out.println("requestBean:"+requestBean);
        System.out.println("sessionBean:"+sessionBean);
        System.out.println("sessionBean:"+sessionBean);
        System.out.println("***********************************");
    }
}
