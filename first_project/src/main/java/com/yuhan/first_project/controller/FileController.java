package com.yuhan.first_project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("file")
public class FileController {
    
    //파일업로드
    @PostMapping("upload")
    public String upload(
    @RequestParam("file") MultipartFile file

    ){

        return file.getOriginalFilename();
    }

}
