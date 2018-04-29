package com.example.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="personType", discriminatorType=DiscriminatorType.STRING)
public abstract class Person {
  @Id
  @GeneratedValue
  private int id;
  private String name;
  @Temporal(TemporalType.DATE)
  private Date placeOfBirth;
  private String biography;
  private String picture;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(Date placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public String getBiography() {
    return biography;
  }

  public void setBiography(String biography) {
    this.biography = biography;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }
  
}