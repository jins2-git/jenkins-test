package com.example.kpi.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class testController {

    @GetMapping("/main")
    public String main(ModelMap model) {
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");

        Date today = new Date();
        String now = sdf.format(today);

        model.addAttribute("now", now);
*/
        return "content/main";
    }
}
