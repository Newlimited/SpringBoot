package com.yuhan.first_project.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.yuhan.first_project.provider.JwtTokenProvider;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    public JwtAuthenticationFilter(JwtTokenProvider jwtTokenProvider){
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
     }
    

     private String parseToken(HttpServletRequest request){
        //Request Header 중 "Authorization" : "Bearer eyjh... " 이것을 가져오겠다는것임
        String token = request.getHeader("Authorization"); // 헤더 이름 지정
        boolean hasToken = token != null && token.equalsIgnoreCase("null"); //authorization 값이 있는 지 확인
        if(!hasToken) return null; // 해당 값이 없다면 null로 지정 반환

        // "Bearer eyJh ..." 을 뽑아냄
        boolean isBearer = token.startsWith("Bearer "); //Bearer 이냐?
        if(!isBearer) return null; //아니면 null
        // eyJh 부터 뽑아냄
        String jwt = token.substring(7); // 맞으면 인덱스 7번부터 받는다.
        return jwt;
     }
}
