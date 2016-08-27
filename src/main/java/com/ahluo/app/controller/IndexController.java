package com.ahluo.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *      Index Controller
 * </pre>
 *
 * @author Ahluo on 2016-8-27.
 */
@RestController
@RequestMapping("start")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {

        return "good";
    }
}
