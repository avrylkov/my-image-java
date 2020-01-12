package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OsController {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss");

    @Autowired
    private MyConfiguration configuration;

    @ResponseBody
    @RequestMapping("/")
    @GetMapping(value="", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> info() {
        List<String> strings = new ArrayList<>();
        strings.add("app.version=" + configuration.getVersionapp());
        strings.add("time=" + LocalDateTime.now().format(formatter));
        strings.add("java.version=" + System.getProperty("java.version"));
        strings.add("os.name=" + System.getProperty("os.name"));
        strings.add("os.version=" + System.getProperty("os.version"));
        strings.add("user.home=" + System.getProperty("user.home"));
        return strings;
    }

}
