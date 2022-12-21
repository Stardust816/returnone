package com.example.returnone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ReturnoneController
{
    @GetMapping("/returnone")
    public int returnOne()
    {
        return 1;
    }
}
