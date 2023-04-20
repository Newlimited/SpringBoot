package com.yuhan.first_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    // Patch Method @PatchMapping
    // Patch Method : 클라이언트가 서버에 데이터를 일부만 수정하기 위한 요청의 Method
    @PatchMapping("patch-method")
    public String patchMethod(){
        return "Response of Patch Request";
    }
    
    // Delete Method @DeleteMapping
    // Delete Method : 클라이언트가 서버에 데이터를 삭제하기 위한 요청의 Method
    @DeleteMapping("delete-method")
    public String deleteMethod(){
        return "Response of Delete Request";
    }

    // PathVariable() 로 Get, Delete Method에서 데이터 받기
    // 리소스에 지정한 패턴에 맞춰서 요청의 URL을 지정한다면 패턴에 맞춰 데이터를 받아오는 형식
    @GetMapping({"path-variable/{data1}/{data2}", "path-variable/{data1}"})
    public String pathVariable(
        @PathVariable(value = "data1") String dataA,
        @PathVariable(value = "data2" ,required = false) String dataB
        // 이것의 입장으로는 입력을 받는것이기 때문에 parameter 자리에 적어준다. 
    ){ 
        return dataA +"와" + dataB + "데이터를 입력 받았습니다.";
    }
 }
    


