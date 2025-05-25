package main.java.com.examly.springappfeedback.model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Feedback {
    @Id 
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    private Long feedbackId;
    private String feedbackText;
    private String date;
    @ManyToOne
    @JoinColumn(name="userId",nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name="investmentId",nullable=true)
    private Investment investment;
    private String category;
    


}

