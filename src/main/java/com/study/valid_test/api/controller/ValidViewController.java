package com.study.valid_test.api.controller;

import com.study.valid_test.common.url.Url;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping(Url.api + Url.v1)
public class ValidViewController {

    @GetMapping(Url.valid + Url.view)
    public String validView(Model model) {
        return "validView";
    }
}
