package main.java.com.examly.springappfeedback.model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;



public class Feedback {
    @Id 
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    private Long feedbackId;
    private String feedbackText;
    private String date;
    private User user;
    private Investment investment;
    private String category;
    


}

