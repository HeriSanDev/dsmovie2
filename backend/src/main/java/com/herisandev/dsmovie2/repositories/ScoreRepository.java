package com.herisandev.dsmovie2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herisandev.dsmovie2.entities.Score;
import com.herisandev.dsmovie2.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
