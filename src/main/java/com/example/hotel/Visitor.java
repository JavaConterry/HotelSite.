package com.example.hotel;

import java.util.Date;

public class Visitor {

    private String registrationName;
    private String email;
    private Date startLiving;
    private Date finishLiving;



    public Visitor(){}

    public Visitor(String registrationName, String email, Date startLiving, Date finishLiving) {
        this.registrationName = registrationName;
        this.email = email;
        this.startLiving = startLiving;
        this.finishLiving = finishLiving;
    }


    public void setRegistrationName(String registrationName){
        this.registrationName = registrationName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getRegistrationName(){
        return this.registrationName;
    }

    public String getEmail(){
        return this.email;
    }

    public Date getStartLiving(){
        return this.startLiving;
    }

    public Date getFinishLiving(){
        return this.finishLiving;
    }



}
