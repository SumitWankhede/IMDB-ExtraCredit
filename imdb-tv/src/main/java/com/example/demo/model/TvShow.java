package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class TvShow {
  public enum Genre {
    ACTION, ADVENTURE, HORROR, ROMANCE, COMEDY, DRAMA, DOCUMENTARY
  };

  @Id
  @GeneratedValue
  private int id;

  private String name;

  @Enumerated(EnumType.STRING)
  private Genre genre;
  
  @Embedded
  private GeneralInfo generalInfo;
  
  private float rating;
  
  @OneToMany(mappedBy = "tvShow")
  private List<Season> seasons = new ArrayList<>();
  
  @ManyToMany
  @JoinTable(name = "tv_show_director", joinColumns = @JoinColumn(name = "tv_show_id"),
      inverseJoinColumns = @JoinColumn(name = "director_id"))
  private List<Director> directors = new ArrayList<>();

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

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public GeneralInfo getGeneralInfo() {
    return generalInfo;
  }

  public void setGeneralInfo(GeneralInfo generalInfo) {
    this.generalInfo = generalInfo;
  }

  public List<Season> getSeasons() {
    return seasons;
  }

  public void setSeasons(List<Season> seasons) {
    this.seasons = seasons;
  }

  public float getRating() {
    return rating;
  }

  public void setRating(float rating) {
    this.rating = rating;
  }

  public List<Director> getDirectors() {
    return directors;
  }

  public void setDirectors(List<Director> directors) {
    this.directors = directors;
  }
  
  
}
