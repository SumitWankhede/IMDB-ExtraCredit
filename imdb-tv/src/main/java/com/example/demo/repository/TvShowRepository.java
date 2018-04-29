
package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.model.TvShow;

public interface TvShowRepository extends JpaRepository<TvShow, Integer> {
  @Query("select distinct tv from TvShow tv "
      + "left join tv.directors director "
      + "left join tv.seasons season "
      + "left join season.episodes episode "
      + "left join episode.artists artist "
      + "left join episode.characters character"
      + " where "
      + "LOWER(tv.name) like CONCAT('%', LOWER(:nameShow), '%') " + "or tv.genre = :genreShow "
      + "or tv.rating = :ratingShow " 
      + "or artist.name = :nameArtis "
      + "or character.name = :nameCharacter "
      + "or director.name = :nameDirector "
      )
  List<TvShow> search(@Param("nameShow") String nameShow,
      @Param("genreShow") TvShow.Genre genreShow, @Param("ratingShow") float ratingShow,
      @Param("nameArtis") String nameArtis, @Param("nameCharacter") String nameCharacter,
      @Param("nameDirector") String nameDirector);
}
