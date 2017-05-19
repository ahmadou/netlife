package com.pictime.doctor;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pictime on 20/05/17.
 */
@Controller
public class DoctorController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
