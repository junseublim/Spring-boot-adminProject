package com.example.study.repository;

import com.example.study.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CateogryRepository extends JpaRepository<Category, Long> {
}
