package com.gpy.redefindsc.asceurekafeignuploadfile.test;

import com.gpy.redefindsc.asceurekafeignuploadfile.service.UploadService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description:
 * @author: guopy
 * @Date: 2020/7/24 15:47
 * @version: v1.0.0
 */
@SpringBootTest
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
public class UploadTest {

    @Autowired
    private UploadService uploadService;

    @Test
    @SneakyThrows
    public void testHandleUpload(){

        File file = new File("E:\\opt\\applog\\lscetkt\\info.log");
        DiskFileItem item = (DiskFileItem) new DiskFileItemFactory().createItem("file", MediaType.TEXT_PLAIN_VALUE, true, file.getName());

        try(InputStream is = new FileInputStream(file);
            OutputStream os = item.getOutputStream()) {
            IOUtils.copy(is,os);

        } catch (Exception e){
            throw new IllegalArgumentException("invalid file: "+e, e);
        }

        MultipartFile multipartFile = new CommonsMultipartFile(item);
        log.info(uploadService.handleFileUpload(multipartFile));
    }

}