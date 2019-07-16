package com.example.demo.controller;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.HashMap;
        import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    public  String  sayHello () {

        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "v");
        String hello = "heollo";
        String s = new String();


        return hello;
    }
}
