package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;

/**
 * @author shkstart
 * @create ${YEAT}-02-28 10:55
 */
@Controller
public class DemoController {

      @RequestMapping("index")
      @ResponseBody
      public String index(){
          return "demoIndex";
    }
}

