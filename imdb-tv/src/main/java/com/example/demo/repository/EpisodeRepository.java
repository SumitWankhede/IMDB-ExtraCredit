
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Episode;

public interface EpisodeRepository extends JpaRepository<Episode, Integer>{

}
