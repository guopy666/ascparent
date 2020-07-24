package com.gpy.redefindsc.asceurekafeignuploadfile.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @author: guopy
 * @Date: 2020/7/24 15:10
 * @version: v1.0.0
 */
@Configuration
public class MultipartSupportConfig {

    public Encoder feignFormEncoder(){
        return new SpringFormEncoder();
    }

}