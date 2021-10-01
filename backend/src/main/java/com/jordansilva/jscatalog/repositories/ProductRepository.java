package com.jordansilva.jscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordansilva.jscatalog.entities.Category;

@Repository
public interface ProductRepository extends JpaRepository<Category, Long> {

}
