package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("Director")
public class Director extends Person {
  @ManyToMany(mappedBy = "directors")
  private List<TvShow> tvShows = new ArrayList<>();
  
}
