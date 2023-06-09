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
        // ExampleEntity exampleEntity = 
        // exampleRepository.findById(1).get();
        ExampleEntity exampleEntity = exampleRepository.findByPk(1);
        //By를 붙여서 조건을 걸수 있다.
        return exampleEntity== null ? "null" :  exampleEntity.toString();
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
        // 데이터 수정
        // 1. 특정 조건으로 Entity 조회
        ExampleEntity exampleEntity = exampleRepository.findById(1).get();
        // 2. 데이터 변경
        exampleEntity.setExampleColumn2("string2");
        // 3. Entity 인스턴스 저장
        exampleRepository.save(exampleEntity);

        // 1. Entity 인스턴스 생성
        ExampleEntity exampleEntity2 = 
        new ExampleEntity(2, "String3", true);
        // 2. Entity 인스턴스 저장
        exampleRepository.save(exampleEntity2);
        return null;
    }
        @Override
        public String deleteMethod() {
        // 데이터 삭제
        // 1. JpaRepository에 있는 deleteeBy 메서드로 Entity 삭제
        
        //    exampleRepository.deleteById(1);
        exampleRepository.deleteByExampleColumn2("string1"); 
        

        return null;
    }
}
