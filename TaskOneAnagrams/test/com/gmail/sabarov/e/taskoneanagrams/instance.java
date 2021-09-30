package com.gmail.sabarov.e.taskoneanagrams;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface instance {

    public Reverse reverse = new Reverse();
    
}
