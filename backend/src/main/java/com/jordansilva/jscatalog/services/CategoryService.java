package com.jordansilva.jscatalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jordansilva.jscatalog.dto.CategoryDTO;
import com.jordansilva.jscatalog.entities.Category;
import com.jordansilva.jscatalog.repositories.CategoryRepository;
import com.jordansilva.jscatalog.services.exceptions.EntityNotFoundException;

@Service
public class CategoryService {

		@Autowired
		private CategoryRepository repository;
	
		@Transactional(readOnly = true)
		public List<CategoryDTO> findAll() {
			List<Category> list = repository.findAll();
			
			return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		}

		@Transactional(readOnly = true)
		public CategoryDTO findById(Long id) {
			Optional<Category> obj = repository.findById(id);
			Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
			return new CategoryDTO(entity);
		}
}
