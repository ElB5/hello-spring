//package org.launchcode.hellospring.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@ResponseBody
//@RequestMapping("hello")
//public class HelloController {
//
//    //static(does not change) request example:
//    //lives at /hello/hello path of localhost:8080
////    @GetMapping("hello")
////    @ResponseBody
////    public String hello() {
////        return "Hello, Spring!";
////    }
//
//
//    // dynamic request handler example,
//    // handles request of form /hello?name=fill in whatever name in address bar
//    //lives at hello/hello
////    @GetMapping("hello")
////    @ResponseBody
////    public String helloWithQueryParam(@RequestParam String name){
////        return "Hello, " + name + "!";
////    }
//
//    @RequestMapping( method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
//    public String helloWithQueryParamPost(@RequestParam String name){
//        return "Hello, " + name + "!";
//    }
//
//    //handles requests of the form /hello/hello/launchcode
//    //lives at /hello/name user enters
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hello, " + name + "!";
//    }
//
////this below coorindates with request handler above helloWithQueryParam as a get request
////    @GetMapping ("form")
////    public String helloForm(){
////        return "<html>" +
////                "<body>" +
////                "<form action='hello'>" + //this tells form to submit action to /hello
////                "<input type='text' name='name'>" +
////                "<input type='submit' value='Greet Me!'>" +
////                "</form>" +
////                "</body>" +
////                "</html>";
////    }
//
//    //this below coorindates with request handler above helloWithQueryParamPost with both a get
//    // and post request option and uses post as seen below
//    @GetMapping ("form")
//    public String helloForm(){
//        return "<html>" +
//                "<body>" +
//                "<form action='hello' method = 'post' >" + //this tells form to submit action to /hello
//                "<input type='text' name='name'>" +
//                "<input type='submit' value='Greet Me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }
//
//}


package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Chris Bay
 */
@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //    // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // Handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/hello' method = 'post'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' >" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}