package com.api;

import com.server.RestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    @Autowired
    private RestServer restServer;

    @RequestMapping(value = "/hello")
    public String hello(){
        return restServer.test();
    }

}
