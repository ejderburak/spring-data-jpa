package com.burakejder.controller.impl;

import com.burakejder.configuration.DataSource;
import com.burakejder.configuration.GlobalProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/property")
public class PropertySourceController {

    @Autowired
    private GlobalProperties globalProperties;

    @GetMapping(path ="/datasource")
    public DataSource getDataSource(){

        DataSource  dataSource = new DataSource();
        dataSource.setUrl(globalProperties.getUrl());
        dataSource.setUsername(globalProperties.getUsername());
        dataSource.setPassword(globalProperties.getPassword());

        return dataSource;
    }
}
