package com.still.stillframework.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Still1
 *
 * This is a controller handled with basic pages.
 */

@Controller
public class BasicController {
    @RequestMapping(value = {"/index"})
    public String indexHandler() {
        return "basic/index";
    }

    @RequestMapping(value = {"/signIn", "/"})
    public String signInHandler() {
        return "basic/signIn";
    }
}
