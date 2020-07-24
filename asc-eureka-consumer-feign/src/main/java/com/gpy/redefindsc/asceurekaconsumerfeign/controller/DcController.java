package com.gpy.redefindsc.asceurekaconsumerfeign.controller;

import com.gpy.redefindsc.asceurekaconsumerfeign.service.DcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: guopy
 * @Date: 2020/7/24 14:59
 * @version: v1.0.0
 */
@RestController
public class DcController {

    @Autowired
    DcClientService dcClientService;

    @GetMapping("/consumer")
    public String dc(){
        return dcClientService.consumer();
    }

}