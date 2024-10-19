package project.Nimap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.Nimap.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
