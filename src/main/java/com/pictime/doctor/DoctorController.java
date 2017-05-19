package com.pictime.doctor;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pictime on 20/05/17.
 */
@Controller
public class DoctorController {

    @PostMapping("/greeting")
    String home(@ModelAttribute TestDto greeting) {
        return greeting.getName();
    }

}
