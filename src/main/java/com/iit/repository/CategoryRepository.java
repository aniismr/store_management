package com.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iit.entity.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category,Long> {

}
