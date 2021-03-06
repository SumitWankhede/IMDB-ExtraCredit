
package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.TvShow;
import com.example.demo.service.TvShowService;
import com.example.demo.model.SearchParam;

@Controller
public class HomeController {
  @Autowired
  private TvShowService tvShowService;

  @GetMapping({"/", "/index", "/home"})
  public String homePage(Model model, @ModelAttribute("search") SearchParam searchParam) {
    model.addAttribute("tvShows", tvShowService.findAll());
    return "index";
  }

  @PostMapping({"/search"})
  public String search(Model model, @ModelAttribute("search") SearchParam searchParam) {
    model.addAttribute("tvShows",
        tvShowService.search(searchParam.getNameShow(), searchParam.getGenreShow(),
            searchParam.getRatingShow(), searchParam.getNameArtist(),
            searchParam.getNameCharacter(), searchParam.getNameDirector()));
    return "index";
  }

  @ModelAttribute("genres")
  public List<TvShow.Genre> productTypes() {
    return Arrays.asList(TvShow.Genre.values());
  }
}

