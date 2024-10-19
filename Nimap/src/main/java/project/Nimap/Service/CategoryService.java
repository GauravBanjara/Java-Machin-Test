package project.Nimap.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import project.Nimap.Entity.Category;
import project.Nimap.Repository.CategoryRepository;

import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Page<Category> getAllCategory(Pageable pageable){
        return categoryRepository.findAll(pageable);
    }

    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).
                orElseThrow(()-> new RuntimeException("Category not found"));
    }

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category updatedCategory){
        return categoryRepository.findById(id).map(category -> {
            category.setName(updatedCategory.getName());
            return categoryRepository.save(category);
        }).orElseThrow(() -> new RuntimeException("Category not found"));
    }

    public void deleteCategory(long id){
        categoryRepository.deleteById(id);
    }
}
