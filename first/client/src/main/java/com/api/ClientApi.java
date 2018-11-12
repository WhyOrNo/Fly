package com.api;

import com.server.ClientServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientApi {

    @Autowired
    private ClientServer clientServer;

    @GetMapping(value = "/value/{name}")
    public String test(@PathVariable("name") String name){
       return clientServer.client(name);
    }

}
