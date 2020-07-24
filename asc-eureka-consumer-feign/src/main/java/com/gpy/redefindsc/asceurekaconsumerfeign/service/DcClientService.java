package com.gpy.redefindsc.asceurekaconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @author: guopy
 * @Date: 2020/7/24 14:58
 * @version: v1.0.0
 */
@FeignClient("eureka-client")
public interface DcClientService {

    @GetMapping("/dc")
    String consumer();
}
