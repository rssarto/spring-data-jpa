package com.example.springdatajpa.controller;

import com.example.springdatajpa.model.FormData;
import com.example.springdatajpa.service.FormDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(FormDataController.URL_PREFIX)
public class FormDataController {

    public static final String URL_PREFIX = "/formdata";

    private final FormDataService formDataService;

    @Autowired
    public FormDataController(FormDataService formDataService) {
        this.formDataService = formDataService;
    }

    @PostMapping
    public FormData create(@RequestBody FormData formData){
        return this.formDataService.create(formData);
    }
}
