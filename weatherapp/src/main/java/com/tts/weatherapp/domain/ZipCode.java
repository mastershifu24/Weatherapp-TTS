package com.tts.weatherapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="ZIPCODE")
public class ZipCode {
    
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String zipCode;


public ZipCode(String zipCode){
    this.zipCode = zipCode;
}

public Long getId(){
    return id;
    
}
}