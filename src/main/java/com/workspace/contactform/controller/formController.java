package com.workspace.contactform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class formController {

    @PostMapping("/save-form")
    @ResponseBody
    public String saveForm() {

        return "saved";
    }
}
