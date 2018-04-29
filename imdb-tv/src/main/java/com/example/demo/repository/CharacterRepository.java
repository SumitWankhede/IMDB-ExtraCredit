package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Character;


public interface CharacterRepository extends JpaRepository<Character, Integer>{

}
