package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Season {
  @Id
  @GeneratedValue
  private int id;
  
  private String name;
  
  @ManyToOne
  @JoinColumn(name = "tvshow_id")
  private TvShow tvShow;
  
  @OneToMany(mappedBy = "season")
  private List<Episode> episodes = new ArrayList<>();

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

  public TvShow getTvShow() {
    return tvShow;
  }

  public void setTvShow(TvShow tvShow) {
    this.tvShow = tvShow;
  }

  public List<Episode> getEpisodes() {
    return episodes;
  }

  public void setEpisodes(List<Episode> episodes) {
    this.episodes = episodes;
  }
  
  
}
