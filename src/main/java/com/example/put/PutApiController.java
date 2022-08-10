package com.example.put;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto postRequestDto, @PathVariable Long userId){
        System.out.println(userId);
        return postRequestDto;
    }
}
