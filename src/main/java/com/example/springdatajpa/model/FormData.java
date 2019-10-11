package com.example.springdatajpa.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "form_data")
public class FormData {
    @GeneratedValue
    @Id
    private long Id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "formData")
    private List<Comment> commentsList;
}
