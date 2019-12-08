package com.example;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class MyCommands {

    @ShellMethod("get System Property")
    public String prop(String env) {
        return System.getProperty(env);
    }

}
