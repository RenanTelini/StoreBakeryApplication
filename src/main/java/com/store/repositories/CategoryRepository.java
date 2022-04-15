package com.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
