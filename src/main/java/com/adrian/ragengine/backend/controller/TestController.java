package com.adrian.ragengine.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/home")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class TestController {

    @GetMapping("/print/{str}")
    public String ReturnMessage(@PathVariable String str)
    {
        return str;
    }

    @PostMapping("/post")
    public void DisplayData(@RequestParam String titleInput, @RequestParam String bodyInput)
    {
        System.out.println(titleInput);
        System.out.println(bodyInput);
    }
}
