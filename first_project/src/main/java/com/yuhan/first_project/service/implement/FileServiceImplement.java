package com.yuhan.first_project.service.implement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.yuhan.first_project.service.FileService;

@Service
public class FileServiceImplement implements FileService {

    @Value ("${(}file.path}") 
    private String FILE_PATH;
   
    @Value ("#{file.url}")
    private String FILE_URL;
    
    
    @Override
    public String upload(MultipartFile file) {
        // 빈 값 검증
        if(file.isEmpty()) return null;
        
        //파일 명 가져오기
        String originalFileName = file.getOriginalFilename();
        
        // 확장자 가져오기
        int extensionIndex = originalFileName.lastIndexOf(".");
        String extension = originalFileName.substring(extensionIndex);

        //파일을 사람들이 올렸을때 이름 그대로 저장하면 겹칠 수도 있다.
        //그래서 새로운 파일들로 지정을 해주는게 좋다.
        
        // 파일의 새로운 이름 지정

    }
}
