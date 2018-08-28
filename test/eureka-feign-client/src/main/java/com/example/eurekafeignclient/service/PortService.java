package com.example.eurekafeignclient.service;

import com.example.eurekafeignclient.EurekaClientFeign;
import com.example.eurekafeignclient.EurekaClientFeignPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by liuxv on 2018/8/6
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Service
public class PortService {
    @Autowired
    EurekaClientFeignPort eurekaClientFeignPort;

    public String getPortConfig(){
        return eurekaClientFeignPort.getPortConfig();
    }
}
