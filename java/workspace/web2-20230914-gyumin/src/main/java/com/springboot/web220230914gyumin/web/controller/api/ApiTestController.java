package com.springboot.web220230914gyumin.web.controller.api;


import com.springboot.web220230914gyumin.web.controller.dto.TestRespDto;
import com.springboot.web220230914gyumin.web.controller.dto.UserResDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ApiTestController {

    @GetMapping("/username")
    public String getUsername() {
        return "gildong";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/userTest")
    public Object getUserTest() {
        return TestRespDto.builder().username("규민").password("1234").build();
    }
    @GetMapping("/user")
    public Object getUser() {
        return UserResDto.builder().username("김규민").password("1234").name("규민").email("efkvg@skfn.com").build();
    }
    @PostMapping("/userLogin")
    public Object postUserLogin(@RequestParam("name")/*리퀘스트 파람 valuename과 변수 이름이 같을떄 생략가능*/ String name, @RequestParam("password") int password) {
        return name+password;

    }
    @GetMapping("/userLogin")
    public Object getUserLogin(@RequestParam("name")/*리퀘스트 파람 valuename과 변수 이름이 같을떄 생략가능*/ String name, @RequestParam("password") int password) {
        return name+password;

    }
}
