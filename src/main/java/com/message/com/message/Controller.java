package com.message.com.message;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String showFirst() {
        return "startform";
    }

    @GetMapping("/getresult")
    public String showResult(String comb, String count, Model model) {
        model.addAttribute("res", Message.ifContains(count, comb) ? "YES" : "NO");
        return "startform";
    }
}
