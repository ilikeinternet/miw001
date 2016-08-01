package co.miw.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class CommonController {
   @RequestMapping("/add")
   public void add(String n, String p) {
      System.out.println("add---");
      System.out.println(n + "---add---" + p);

   }
}
