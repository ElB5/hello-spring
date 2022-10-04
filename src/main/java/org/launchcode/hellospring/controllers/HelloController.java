package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris Bay
 */
//@Controller
//@ResponseBody
//@RequestMapping("hello")
//public class HelloController {
//
//    //    // Handle request at path /hello
//    @GetMapping(value="hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }
//
////    // lives at /hello/goodbye
//    @GetMapping(value="goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//    // Handles requests of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }
//
//    // Handles requests of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
//}

//
//@Controller
//public class HelloController {
//
//    @ResponseBody
//    @GetMapping(value="")
//    public String index(){
//        return "Hello, World.";
//    }
//
//    @GetMapping(value="hello")
//    @ResponseBody
//    public String helloForm() {
//
//        String html = "<form method='post'>" +
//                "<input type = 'text' name = 'name' />" +
//                "<select name = 'language'>" +
//                "<option value = 'english'>English</option>" +
//                "<option value = 'french'>French</option>" +
//                "<option value = 'italian'>Italian</option>" +
//                "<option value = 'spanish'>Spanish</option>" +
//                "<option value = 'german'>German</option>" +
//                "</select>" +
//                "<input type = 'submit' value = 'Greet Me!' />" +
//                "</form>";
//        return html;
//    }
//
//    @PostMapping(value="hello")
//    @ResponseBody
//    public String helloPost(@RequestParam String name, @RequestParam String language) {
//        if (name == null) {
//            name = "World";
//        }
//
//        return createMessage(name, language);
//
//        // For a bonus mission, students can change this response text to look nicer.
//        // This is subjective, but students should be modifying the HTML of the response string.
//    }
//
//    private static String createMessage(String n, String l) {
//        String greeting = "";
//
//        if (l.equals("english")) {
//            greeting = "Hello";
//        }
//        else if (l.equals("french")) {
//            greeting = "Bonjour";
//        }
//        else if (l.equals("italian")) {
//            greeting = "Bonjourno";
//        }
//        else if (l.equals("spanish")) {
//            greeting = "Hola";
//        }
//        else if (l.equals("german")) {
//            greeting = "Hallo";
//        }
//
//        return greeting + " " + n;
//    }
//
//
//}



/**
 * Created by Chris Bay
 */
@Controller
public class HelloController {

    //    // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String hello(@RequestParam String name, Model model) {
        String thegreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", thegreeting);
        return "hello";
    }

    // Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name, Model model) {
        String thegreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", thegreeting);
        return "hello";
    }


    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";
    }
}