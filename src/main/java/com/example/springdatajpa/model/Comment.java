package com.example.springdatajpa.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "comments")
public class Comment {

    @GeneratedValue
    @Id
    private Long id;

    private String text;

    @ManyToOne
    @JoinColumn(name = "form_data_id", referencedColumnName = "id", nullable = false)
    private FormData formData;

}
