package com.example.spring101;

import org.springframework.data.jpa.repository.JpaRepository;

public interface YelpRepository extends JpaRepository<Yelp, Integer> {
}
