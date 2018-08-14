package jsjzx.wlyw.sb005bootstraptable.controller;

import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {

    @RequestMapping("testController")
    public String testController(){
        System.out.println("jsjzx.wlyw.sb005bootstraptable.controller.ControllerTest.testController");
        return "t";
    }
}
