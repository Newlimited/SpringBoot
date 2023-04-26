package com.yuhan.board.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuhan.board.dto.request.User.PostUserRequestDto;

@RestController
@RequestMapping("/api/v1/user") //여기는 api 이고 / 현재 버젼1 이고 / 모듈은 user라는 모듈
public class UserController {
    
    @PostMapping("")
    public ResponseEntity<?> postUser(
      @Valid  @RequestBody PostUserRequestDto reeequestBody 
        // 여기까지는 validation을 적용할 수 없다. 앞에 valid를 붙인다.
    ){
        
        return null;
    }
}
