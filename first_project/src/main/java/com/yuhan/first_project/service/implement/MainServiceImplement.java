

package com.yuhan.first_project.service.implement;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yuhan.first_project.provider.JwtTokenProvider;
import com.yuhan.first_project.service.MainService;

@Service
public class MainServiceImplement  implements MainService{

    private JwtTokenProvider jwtTokenProvider;

    public MainServiceImplement(JwtTokenProvider jwtoJwtTokenProvider){
    this.jwtTokenProvider = jwtoJwtTokenProvider;
    }
    @Override
    public String hello() {
        return "Hello syh";
    }
    @Override
    public String getJwt(String data){
        String jwt = jwtTokenProvider.creat(data);
        return jwt;
    }
    @Override
    public String validJwt(String jwt){
        String subject = jwtTokenProvider.validate(jwt);
        return subject;
    }

}