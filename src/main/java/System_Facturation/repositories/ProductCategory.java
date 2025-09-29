package System_Facturation.repositories;

import System_Facturation.domain.entities.Category;
import System_Facturation.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategory extends JpaRepository<Product, Long> {
List<Product> findByCategory(Category category);
List<Product> findByNameContainingIgnoreCase(String name);

}
