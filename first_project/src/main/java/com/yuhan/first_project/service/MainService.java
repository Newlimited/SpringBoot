package com.yuhan.first_project.service;

import org.springframework.stereotype.Component;

@Component
public interface MainService {
    public String hello();
    public String getJwt(String data);
    public String validJwt(String jwt);
}
