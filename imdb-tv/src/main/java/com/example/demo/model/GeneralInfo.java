package com.example.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class GeneralInfo {
  private String poster;
  private String summary;
  private int year;
  public String getPoster() {
    return poster;
  }
  public void setPoster(String poster) {
    this.poster = poster;
  }
  public String getSummary() {
    return summary;
  }
  public void setSummary(String summary) {
    this.summary = summary;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  
}
