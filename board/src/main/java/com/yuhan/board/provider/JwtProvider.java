package com.yuhan.board.provider;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component // 제어 역전을 시켜주기 위해서 component 를 걸어준다.
public class JwtProvider {

    @Value("${jwt.secret-key}")
    private String SECRET_KEY;

    public String create(String email) {

        Date expiredDate = Date.from(Instant.now().plus(1, ChronoUnit.HOURS));
        String id = "qwer";
        int role = 1;  // 이것을 jwt에 넣고싶다면
        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                // .setSubject(email)
                // .setIssuedAt(new Date())
                // .setExpiration(expiredDate)
                
                .compact();

        return jwt;

    }
    public String validate(String jwt) {
        Claims claims = Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(jwt)
                .getBody();
                
                return claims.getSubject();
            }

}
