package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String startPrompt() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>\n" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>\n" +
                "<ol>\n" +
                "    <li>Java</li>\n" +
                "    <li>JavaScript</li>\n" +
                "    <li>Python</li>\n" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<form method = 'post' action = '/skills'>" +
                "   <label>Name: <input type = 'text' name = 'name' /></label>" +
                "   <label>My favorite language: " +
                "       <select name='language'>" +
                "           <option value=''>* Select Language *</option>" +
                "           <option value='Java'>Java</option>" +
                "           <option value='JavaScript'>JavaScript</option>" +
                "           <option value='Python'>Python</option>" +
                "       </select>" +
                "   </label>" +
                "   <label>My second favorite language: " +
                "       <select name='language2'>" +
                "           <option value=''>* Select Language *</option>" +
                "           <option value='Java'>Java</option>" +
                "           <option value='JavaScript'>JavaScript</option>" +
                "           <option value='Python'>Python</option>" +
                "       </select>" +
                "   </label>" +
                "   <label>My third favorite language: " +
                "       <select name='language3'>" +
                "           <option value=''>* Select Language *</option>" +
                "           <option value='Java'>Java</option>" +
                "           <option value='JavaScript'>JavaScript</option>" +
                "           <option value='Python'>Python</option>" +
                "       </select>" +
                "   </label>" +
                "   <input type = 'submit' value = 'Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value = "skills", method = {RequestMethod.GET, RequestMethod.POST})
    public String formSubmission(@RequestParam String name, String language, String language2, String language3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "   <li>" + language + "</li>" +
                "   <li>" + language2 + "</li>" +
                "   <li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
