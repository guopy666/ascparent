package com.gpy.redefindsc.asceurekaconsumerfeign.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description:
 * @author: guopy
 * @Date: 2020/7/24 15:15
 * @version: v1.0.0
 */
@RestController
public class UploadFileController {

    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(@RequestPart(value = "file")MultipartFile file){
        System.out.println(file.getName()+"--------");
        return file.getName();
    }

}