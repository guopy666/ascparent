package com.gpy.redefindsc.asceurekafeignuploadfile.service;

import com.gpy.redefindsc.asceurekafeignuploadfile.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description:
 * @author: guopy
 * @Date: 2020/7/24 15:11
 * @version: v1.0.0
 */
@FeignClient(value = "eureka-consumer-feign", configuration = MultipartSupportConfig.class)
public interface UploadService {

    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String handleFileUpload(MultipartFile file);

}
