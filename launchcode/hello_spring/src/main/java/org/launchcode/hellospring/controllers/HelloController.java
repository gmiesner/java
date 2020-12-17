package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@ResponseBody // every method now inherits this
//@RequestMapping("hello")
public class HelloController {
// handles requests at path /hello
  @GetMapping("hello")
   @ResponseBody
   public String hello(){
       return "Hello, Spring!";
   }
//
   @GetMapping("")
  @ResponseBody
   public String index(){return "Hello World";}
//
 @GetMapping("goodbye") // now this lives at /hello/goodbye
  public String goodbye(){
      return "Goodbye, Spring!";
   }
//
//    // create a handler that uses names
//    // lives at /hello/?name=(whatever you enter as name)
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}) // get and post mapping now available
    public String helloWithQueryParam(@RequestParam String name){
       return "Hello, " + name + "!";
    }
// // lives at /hello/(whatever you enter as name)
   @GetMapping("{name}")
   public String helloWithPathParam(@PathVariable String name){
       return "Hello, " + name + "!";
    }
// lives at /hello/helloForm
    @GetMapping("helloForm")
    @ResponseBody
    public String helloForm(){
       return "<html> " +
                "<body>" +
                "<form method = \'post\'>" +
              "<input type = \'String\' name = \'name\'>" +
                "<select name = \'language\'>"+
                "<option value = \'English\'> English </option>" +
                "<option value = \'Spanish\'> Spanish </option>" +
                "<option value = \'Farsi\'> Farsi </option>" +
                "<option value = \'French\'> French </option>" +
                "<option value = \'German\'> German </option>" +
                "</select>  " +
               "<input type = \'submit\' value = 'Greet me!'>" +
                "</form>" +
               "</body>" +
               "</html>";
    }

    @RequestMapping(value = "helloForm", method = RequestMethod.POST)
    @ResponseBody
    public String respond(@RequestParam String name, @RequestParam String language){
        String response;
        switch (language){
            case "English" :
                response = "Hello";
                break;
            case "Spanish" :
                response = "Hola";
                break;
            case "Farsi" :
                response = "سلام";
                break;
            case "French" :
                response = "Bonjour";
                break;
            case "German" :
                response = "Hallo";
                break;
            default:
                response = "Hello";

        }
        return response + ", " + name + "!";
    }
//@RequestMapping(method = {RequestMethod.POST, RequestMethod.GET})
//    public static String createMessage(String name, String language){
//
//    }

}
