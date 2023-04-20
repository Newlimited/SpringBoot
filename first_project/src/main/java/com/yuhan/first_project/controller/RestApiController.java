package com.yuhan.first_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// Rest API를 위한 Controller 임을 명시해주는 어노테이션 
// @Controller + @Response Body = @RestController
// Response는 HTML을 제외한 MIME Type을 반환한다.
@RestController
// URL path 패턴을 지정해서 해당 패턴이면 지정한 클래스로 처리하도록 함
@RequestMapping(value = "api")
public class RestApiController {
    
    @RequestMapping(method  ={RequestMethod.GET}, value = "hello2")
    public String hello2(){
        return "hello2";
    }

    // GET Method @GetMapping
    // GET Method : 클라이언트가 서버에게 데이터를 받기 위한 요청의 Method
    // @RequesetMaaping(method = RequestMethod.GET, value = "get-method")
    @GetMapping("get-method")
        public String getMethod(){
            return "Response of Get Request";
        }

    // POST Method @PostMapping
    // Post Method : 클라이언트가 서버에 데이터를 작성하기 위한 요청의 Method
    // @RequestMapping (method = RequestMethod.POST, value =" post-method")
    @PostMapping("post-method")
    public String postMethod(){
        
        return "Response of Post Request";
    }

}

