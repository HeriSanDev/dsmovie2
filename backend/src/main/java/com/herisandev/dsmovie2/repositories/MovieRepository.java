package com.herisandev.dsmovie2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herisandev.dsmovie2.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
