package com.iit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.iit.dto.CategoryDto;
import com.iit.entity.Category;
import com.iit.factory.CategoryFactory;
import com.iit.repository.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
   
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    
    public CategoryDto save(CategoryDto categoryDto) {
    	categoryRepository.saveAndFlush (CategoryFactory.categoryDtoToCategory (categoryDto));
        return categoryDto;
   }

	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	public CategoryDto findOne(long id) {
		  Optional<Category> category=categoryRepository.findById (id);
	      
	        return CategoryFactory.categoryToCategoryDto(category.get());	}

	public void deleteById(long id) {
		categoryRepository.deleteById(id);
	}
}
