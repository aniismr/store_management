package com.iit.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iit.dto.CategoryDto;
import com.iit.entity.Category;
import com.iit.service.CategoryService;

@CrossOrigin("*")
@RequestMapping(value = "/categories")
@RestController()
public class CategoryController {
	
	 private CategoryService categoryService;

	    public CategoryController(CategoryService categoryService) {
	        this.categoryService = categoryService;
	    }
	    
	    @GetMapping()

	    public List<Category> findAll(){
	        return categoryService.findAll ();
	    }
	    
	    @GetMapping("/{id}")
	    public CategoryDto findOne(@PathVariable("id") long id) {
	        return categoryService.findOne (id);
	    }
	    
	    @PostMapping("/{id}")
	    public CategoryDto add(@Valid @RequestBody CategoryDto categoryDto){
	        return this.categoryService.save (categoryDto);
	    }

	    @PutMapping("/{id}")
	    public CategoryDto update(@Valid @RequestBody CategoryDto categoryDto){
	        return this.categoryService.save (categoryDto);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable("id") long id){
	        this.categoryService.deleteById (id);
	    }

}
