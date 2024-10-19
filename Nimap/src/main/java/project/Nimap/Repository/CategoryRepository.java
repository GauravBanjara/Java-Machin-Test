package project.Nimap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.Nimap.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
