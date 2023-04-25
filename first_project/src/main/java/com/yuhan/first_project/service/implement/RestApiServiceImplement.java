package com.yuhan.first_project.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yuhan.first_project.entity.ExampleEntity;
import com.yuhan.first_project.repository.ExampleRepository;

@Service
public class RestApiServiceImplement implements RestApiService {
    private ExampleRepository  exampleRepository;
    
    @Autowired
    public RestApiServiceImplement(ExampleRepository  exampleRepository){
        this.exampleRepository = exampleRepository;
    }
    
    @Override
    public String getMethod() {
        // 데이터 조회
        // 1. JpaRepository에 있는 findBy 메서드로 Entity 조회
        ExampleEntity exampleEntity = 
        exampleRepository.findById(1).get();

        return exampleEntity.toString();
    }

    @Override
    public String postMethod() {
        // 데이터 삽입
        // 1. Entity 인스턴스 (= 데이터베이스 테이블의 레코드) 생성
        ExampleEntity exampleEntity = 
        ExampleEntity.builder()
        .exampleColumn2("string1")
        .exampleColumn3(false)
        .build();

        // 2. 해당 Entity Repository를 거쳐서 Entity 인스턴스를 저장
        exampleRepository.save(exampleEntity);
        return null;
    }
    @Override
    public String patchMethod() {
        return null;
    }
    @Override
    public String deleteMethod() {
        return null;
    }
    

}
