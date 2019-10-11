package com.example.springdatajpa.service;

import com.example.springdatajpa.model.FormData;
import com.example.springdatajpa.repository.FormDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FormDataService {

    private final FormDataRepository formDataRepository;

    @Autowired
    public FormDataService(FormDataRepository formDataRepository) {
        this.formDataRepository = formDataRepository;
    }

    @Transactional
    public FormData create(FormData formData){
        return this.formDataRepository.save(formData);
    }
}
